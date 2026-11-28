package irvine.math.group;

import java.util.ArrayList;
import java.util.List;

/**
 * Schreier chains on the standard basis vectors of a binary linear group.
 * @author Gregory Morse
 */
final class BinaryStrongChain {

  private final int mN;
  private final long mIdentity;
  private long[][] mTransversals;
  private long[][] mInverses;
  private long mOrder;

  private static final class Generator {
    private final long mMatrix;
    private final int mLevel;

    private Generator(final long matrix, final int level) {
      mMatrix = matrix;
      mLevel = level;
    }
  }

  BinaryStrongChain(final int n, final long[] generators) {
    mN = n;
    mIdentity = BinaryLinearActions.identity(n);
    final List<Generator> strong = new ArrayList<>();
    for (final long g : generators) {
      if (g != mIdentity) {
        strong.add(new Generator(g, level(g)));
      }
    }
    while (true) {
      build(strong);
      final Generator missing = missing(strong);
      if (missing == null) {
        return;
      }
      strong.add(missing);
    }
  }

  private int level(final long matrix) {
    for (int k = 0; k < mN; ++k) {
      if (BinaryLinearActions.column(matrix, k, mN) != (1 << k)) {
        return k;
      }
    }
    return mN;
  }

  private void build(final List<Generator> strong) {
    final int size = 1 << mN;
    mTransversals = new long[mN][size];
    mInverses = new long[mN][size];
    mOrder = 1;
    for (int l = 0; l < mN; ++l) {
      final int[] orbit = new int[size];
      final long[] transversals = mTransversals[l];
      orbit[0] = 1 << l;
      transversals[orbit[0]] = mIdentity;
      int end = 1;
      for (int i = 0; i < end; ++i) {
        for (final Generator gen : strong) {
          if (gen.mLevel >= l) {
            final int y = BinaryLinearActions.apply(gen.mMatrix, orbit[i], mN);
            if (transversals[y] == 0) {
              transversals[y] = BinaryLinearActions.multiply(gen.mMatrix, transversals[orbit[i]], mN);
              orbit[end++] = y;
            }
          }
        }
      }
      mOrder *= end;
      for (int i = 0; i < end; ++i) {
        mInverses[l][orbit[i]] = BinaryLinearActions.inverse(transversals[orbit[i]], mN);
      }
    }
  }

  private Generator missing(final List<Generator> strong) {
    for (int k = 0; k < mN; ++k) {
      for (int x = 1; x < mTransversals[k].length; ++x) {
        if (mTransversals[k][x] != 0) {
          for (final Generator gen : strong) {
            if (gen.mLevel >= k) {
              final int y = BinaryLinearActions.apply(gen.mMatrix, x, mN);
              long z = BinaryLinearActions.multiply(mInverses[k][y],
                BinaryLinearActions.multiply(gen.mMatrix, mTransversals[k][x], mN), mN);
              for (int j = k + 1; j < mN; ++j) {
                final int p = BinaryLinearActions.column(z, j, mN);
                if (mInverses[j][p] == 0) {
                  return new Generator(z, j);
                }
                z = BinaryLinearActions.multiply(mInverses[j][p], z, mN);
              }
              if (z != mIdentity) {
                throw new IllegalStateException("Standard basis is not faithful");
              }
            }
          }
        }
      }
    }
    return null;
  }

  long order() {
    return mOrder;
  }

  boolean contains(long matrix) {
    for (int j = 0; j < mN; ++j) {
      final int p = BinaryLinearActions.column(matrix, j, mN);
      if (mInverses[j][p] == 0) {
        return false;
      }
      matrix = BinaryLinearActions.multiply(mInverses[j][p], matrix, mN);
    }
    return matrix == mIdentity;
  }
}
