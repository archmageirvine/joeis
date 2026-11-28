package irvine.math.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Scalar quotient and exact subgroup lifts of the quadratic semilinear group.
 * @author Gregory Morse
 */
final class BinaryProjectiveSubgroups {

  private static final int ORDER = 2 * 63 * 60 * 48;
  private final int[] mProject = new int[ORDER];
  private final int[] mLift = new int[ORDER / 3];
  private final long[] mGenerators = BinaryMatrixGroupCensus.semilinearFourGenerators();
  private final BinaryMatrixGroupCensus mGroup;
  private final int mScalar;
  private final int mSquare;

  BinaryProjectiveSubgroups(final BinaryMatrixGroupCensus group) {
    mGroup = group;
    final List<Long> fields = BinaryNormalizedFields.quadratic(mGenerators);
    if (fields.size() != 1) {
      throw new IllegalStateException("Missing quadratic field");
    }
    mScalar = mGroup.index(fields.get(0));
    mSquare = mGroup.inverse(mScalar);
    Arrays.fill(mProject, -1);
    int size = 0;
    for (int a = 0; a < ORDER; ++a) {
      if (mProject[a] < 0) {
        if (size == mLift.length) {
          throw new IllegalStateException("Wrong scalar quotient order");
        }
        mLift[size] = a;
        mProject[a] = size;
        mProject[mGroup.multiply(a, mScalar)] = size;
        mProject[mGroup.multiply(a, mSquare)] = size++;
      }
    }
    if (size != mLift.length) {
      throw new IllegalStateException("Wrong scalar quotient order");
    }
  }

  private int multiply(final int a, final int b) {
    return mProject[mGroup.multiply(mLift[a], mLift[b])];
  }

  private int inverse(final int a) {
    return mProject[mGroup.inverse(mLift[a])];
  }

  private int[] preimage(final int[] generators) {
    final int[] result = Arrays.copyOf(Arrays.stream(generators).map(a -> mLift[a]).toArray(), generators.length + 1);
    result[generators.length] = mScalar;
    return result;
  }

  private int order(final int generator) {
    int n = 1;
    for (int x = generator; x != 0; x = multiply(x, generator)) {
      ++n;
    }
    return n;
  }

  private List<int[]> possibleLifts(final int[] generators) {
    final List<int[]> result = new ArrayList<>();
    for (final int g : generators) {
      final int order = order(g);
      final int a = mLift[g];
      final int[] valid = new int[3];
      int size = 0;
      for (final int lift : new int[] {a, mGroup.multiply(a, mScalar), mGroup.multiply(a, mSquare)}) {
        int x = 0;
        for (int i = 0; i < order; ++i) {
          x = mGroup.multiply(x, lift);
        }
        if (x == 0) {
          valid[size++] = lift;
        }
      }
      result.add(Arrays.copyOf(valid, size));
    }
    return result;
  }

  private boolean irreducibleComplement(final BinaryParabolicSubgroups.Entry subgroup) {
    final int[] generators = subgroup.mGenerators;
    final List<int[]> lifts = possibleLifts(generators);
    int assignments = 1;
    for (final int[] choices : lifts) {
      assignments = Math.multiplyExact(assignments, choices.length);
    }
    if (assignments == 0) {
      return false;
    }
    final int[] selected = new int[generators.length];
    final int[] section = new int[ORDER / 3];
    final int[] orbit = new int[subgroup.mOrder];
    for (int k = 0; k < assignments; ++k) {
      int name = k;
      for (int i = 0; i < selected.length; ++i) {
        final int[] choices = lifts.get(i);
        selected[i] = choices[name % choices.length];
        name /= choices.length;
      }
      if (!BinaryWreathSubgroups.irreducible(mGroup.matrices(selected))) {
        continue;
      }
      Arrays.fill(section, -1);
      section[0] = 0;
      int size = 1;
      boolean consistent = true;
      for (int i = 0; i < size && consistent; ++i) {
        for (final int g : selected) {
          final int x = mGroup.multiply(orbit[i], g);
          final int label = mProject[x];
          if (section[label] < 0) {
            section[label] = x;
            orbit[size++] = x;
          } else if (section[label] != x) {
            consistent = false;
            break;
          }
        }
      }
      if (consistent) {
        if (size != subgroup.mOrder) {
          throw new IllegalStateException("The complement did not cover its image");
        }
        return true;
      }
    }
    return false;
  }

  BinaryParabolicSubgroups subgroups() {
    final int[] ids = new int[ORDER / 3];
    Arrays.setAll(ids, i -> i);
    final int[] generators = Arrays.stream(mGenerators).mapToInt(g -> mProject[mGroup.index(g)]).toArray();
    final BinaryParabolicSubgroups projective = BinaryParabolicSubgroups.explicit(0, ids, generators, this::multiply, this::inverse);
    // Subgroups containing the scalar kernel are full preimages. Any other
    // subgroup is a complement over its own projection; check all such lifts.
    final BinaryParabolicSubgroups lifted = mGroup.subgroupContainer();
    final int[] projectiveToLifted = new int[projective.mRepresentatives.size()];
    Arrays.fill(projectiveToLifted, -1);
    for (final BinaryParabolicSubgroups.Entry entry : projective.mRepresentatives) {
      final int[] preimage = preimage(entry.mGenerators);
      if (BinaryWreathSubgroups.irreducible(mGroup.matrices(preimage))) {
        if (irreducibleComplement(entry)) {
          return mGroup.subgroups();
        }
        projectiveToLifted[entry.mIndex] = lifted.mRepresentatives.size();
        lifted.offerProduct(preimage, preimage(entry.mNormalizer), 3 * entry.mOrder, ORDER / entry.mClassSize);
      }
    }
    lifted.setLocator(elements -> {
      final int[] projected = Arrays.stream(elements).map(e -> mProject[e]).distinct().toArray();
      if (3 * projected.length != elements.length) {
        throw new IllegalStateException("Located subgroup does not contain the scalar group");
      }
      final BinaryParabolicSubgroups.Projection found = projective.locate(projected);
      return new BinaryParabolicSubgroups.Projection(lifted.mRepresentatives.get(projectiveToLifted[found.mEntry.mIndex]), 0);
    });
    return lifted;
  }
}
