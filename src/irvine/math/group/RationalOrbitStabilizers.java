package irvine.math.group;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import irvine.math.z.Z;

/**
 * Bounded stabilizer chains for faithful vector actions of rational groups.
 * @author Gregory Morse
 */
final class RationalOrbitStabilizers {

  private static final int CELL_LIMIT = Math.min(64000000, Integer.getInteger("joeis.rational.audit.chainCells", 26000000));

  private static final class Level {
    private final char[][] mForward;
    private final char[][] mBackward;
    private final List<Integer> mOrbit = new ArrayList<>();
    private final List<char[]> mGenerators = new ArrayList<>();

    private Level(final char[] identity, final int point) {
      mForward = new char[identity.length][];
      mBackward = new char[identity.length][];
      mForward[point] = identity;
      mBackward[point] = identity;
      mOrbit.add(point);
    }
  }

  private final int[] mBase;
  private final char[] mIdentity;
  private final Level[] mLevels;
  private Z mOrder;

  @FunctionalInterface
  interface ImageConstraint {
    // -2 means unrestricted; -1 means the necessary image is absent.
    int image(int level, int[] precedingImages);
  }

  private RationalOrbitStabilizers(final int[] base, final char[] identity) {
    mBase = base;
    mIdentity = identity;
    mLevels = new Level[base.length];
  }

  static char[] product(final char[] a, final char[] b) {
    final char[] c = new char[a.length];
    for (int i = 0; i < c.length; ++i) {
      c[i] = b[a[i]];
    }
    return c;
  }

  private static char[] inverse(final char[] a) {
    final char[] inverse = new char[a.length];
    for (int i = 0; i < a.length; ++i) {
      inverse[a[i]] = (char) i;
    }
    return inverse;
  }

  private boolean build(final List<char[]> generators) {
    mOrder = Z.ONE;
    long cells = 0;
    for (int i = 0; i < mBase.length; ++i) {
      mLevels[i] = new Level(mIdentity, mBase[i]);
    }
    for (final char[] g : generators) {
      for (int i = 0; i < mBase.length; ++i) {
        mLevels[i].mGenerators.add(g);
        if (g[mBase[i]] != mBase[i]) {
          break;
        }
      }
    }
    for (final Level level : mLevels) {
      for (int i = 0; i < level.mOrbit.size(); ++i) {
        final int x = level.mOrbit.get(i);
        for (final char[] g : level.mGenerators) {
          final int y = g[x];
          if (level.mForward[y] == null) {
            cells += mIdentity.length;
            if (cells > CELL_LIMIT) {
              return false;
            }
            level.mForward[y] = product(level.mForward[x], g);
            level.mBackward[y] = inverse(level.mForward[y]);
            level.mOrbit.add(y);
          }
        }
      }
      mOrder = mOrder.multiply(level.mOrbit.size());
    }
    return true;
  }

  private static int image(final char[][] word, final int length, int point) {
    for (int i = 0; i < length; ++i) {
      point = word[i][point];
    }
    return point;
  }

  private int sift(final char[][] word, int length, final int start) {
    for (int i = start; i < mBase.length; ++i) {
      final int point = mBase[i];
      final int next = image(word, length, point);
      if (next != point) {
        final char[] backward = mLevels[i].mBackward[next];
        if (backward == null) {
          return length;
        }
        word[length++] = backward;
      }
    }
    return -1;
  }

  boolean contains(final char[] permutation) {
    final char[][] word = new char[mBase.length + 1][];
    word[0] = permutation;
    return sift(word, 1, 0) < 0;
  }

  private char[] missingSchreierGenerator() {
    final char[][] word = new char[mBase.length + 3][];
    for (int i = mLevels.length - 1; i >= 0; --i) {
      final Level level = mLevels[i];
      for (final int x : level.mOrbit) {
        for (final char[] g : level.mGenerators) {
          word[0] = level.mForward[x];
          word[1] = g;
          word[2] = level.mBackward[g[x]];
          final int needed = sift(word, 3, i + 1);
          if (needed >= 0) {
            char[] next = word[0];
            for (int j = 1; j < needed; ++j) {
              next = product(next, word[j]);
            }
            return next;
          }
        }
      }
    }
    return null;
  }

  static Optional<RationalOrbitStabilizers> certify(final char[][] generators, final int[] base, final Z order) {
    final char[] identity = new char[generators[0].length];
    for (int i = 0; i < identity.length; ++i) {
      identity[i] = (char) i;
    }
    final List<char[]> strong = new ArrayList<>(List.of(generators));
    final RationalOrbitStabilizers chain = new RationalOrbitStabilizers(base, identity);
    for (int attempt = 0; attempt < 64; ++attempt) {
      if (!chain.build(strong)) {
        if (Boolean.getBoolean("joeis.rational.audit.cyclicDetails")) {
          System.out.println("CHAIN " + order + ": transversal storage cap reached");
        }
        return Optional.empty();
      }
      if (chain.mOrder.compareTo(order) > 0) {
        return Optional.empty();
      }
      if (chain.mOrder.equals(order)) {
        // Representatives from successive point stabilizers give a
        // unique product for every counted group element. Once their
        // product attains the independently supplied group order, the
        // reduction is faithful and the strip test is exact.
        return Optional.of(chain);
      }
      final char[] missing = chain.missingSchreierGenerator();
      if (missing == null) {
        return Optional.empty();
      }
      strong.add(missing);
    }
    return Optional.empty();
  }

  private void visit(final int level, final char[] prefix, final Consumer<char[]> action) {
    if (level < 0) {
      action.accept(prefix);
    } else {
      final Level row = mLevels[level];
      for (final int point : row.mOrbit) {
        final char[] factor = row.mForward[point];
        visit(level - 1, factor == mIdentity ? prefix : prefix == mIdentity ? factor : product(prefix, factor), action);
      }
    }
  }

  void forEach(final Consumer<char[]> action) {
    visit(mLevels.length - 1, mIdentity, action);
  }

  private boolean constrained(final int level, final char[] suffix, final int[] images, final ImageConstraint filter,
                              final Consumer<char[]> action, final int[] work) {
    if (level == mLevels.length) {
      action.accept(suffix);
      return true;
    }
    final int required = filter.image(level, images);
    if (required == -1) {
      return true;
    }
    final Level row = mLevels[level];
    for (final int point : row.mOrbit) {
      final int image = suffix[point];
      if (required == -2 || required == image) {
        if (--work[0] < 0) {
          return false;
        }
        images[level] = image;
        final char[] factor = row.mForward[point];
        final char[] next = factor == mIdentity ? suffix : suffix == mIdentity ? factor : product(factor, suffix);
        if (!constrained(level + 1, next, images, filter, action, work)) {
          return false;
        }
      }
    }
    return true;
  }

  boolean forEach(final ImageConstraint filter, final Consumer<char[]> action, final int budget) {
    return constrained(0, mIdentity, new int[mLevels.length], filter, action, new int[] {budget});
  }
}
