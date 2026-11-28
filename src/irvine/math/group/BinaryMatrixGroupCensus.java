package irvine.math.group;

import java.util.Arrays;
import java.util.BitSet;

/**
 * Convert a bounded binary matrix group to compact element identifiers.
 * @author Gregory Morse
 */
final class BinaryMatrixGroupCensus {

  private final int mN;
  private final int mMask;
  private final long[] mMatrices;
  private final long[] mKeys;
  private final int[] mIndices;
  private final byte[][] mActions;
  private final int[] mInverses;
  private final int[] mGenerators;

  BinaryMatrixGroupCensus(final int n, final int order, final long[] generators) {
    if (n < 1 || n > 6 || order < 1 || order > (1 << 22)) {
      throw new IllegalArgumentException("Explicit matrix group exceeds the supported size");
    }
    mN = n;
    mMask = (1 << n) - 1;
    mMatrices = new long[order];
    final int threshold = Math.multiplyExact(2, order);
    final int slots = Integer.highestOneBit(threshold - 1) << 1;
    mKeys = new long[slots];
    mIndices = new int[slots];
    mMatrices[0] = BinaryLinearActions.identity(n);
    add(mMatrices[0], 0);
    int size = 1;
    for (int i = 0; i < size; ++i) {
      for (final long generator : generators) {
        final long product = BinaryLinearActions.multiply(mMatrices[i], generator, n);
        if (add(product, size)) {
          if (size == order) {
            throw new IllegalStateException("Generated matrix group exceeds its structural order");
          }
          mMatrices[size++] = product;
        }
      }
    }
    if (size != order) {
      throw new IllegalStateException("Generated matrix group does not attain its structural order");
    }
    mActions = new byte[order][1 << n];
    mInverses = new int[order];
    for (int i = 0; i < order; ++i) {
      final long matrix = mMatrices[i];
      final byte[] action = mActions[i];
      for (int x = 1; x < action.length; ++x) {
        action[x] = (byte) (action[x & (x - 1)] ^ BinaryLinearActions.column(matrix, Integer.numberOfTrailingZeros(x), n));
      }
      mInverses[i] = index(BinaryLinearActions.inverse(matrix, n));
    }
    mGenerators = Arrays.stream(generators).mapToInt(this::index).toArray();
  }

  private int slot(final long matrix) {
    long hash = matrix;
    hash = (hash ^ (hash >>> 33)) * 0xff51afd7ed558ccdL;
    hash = (hash ^ (hash >>> 33)) * 0xc4ceb9fe1a85ec53L;
    hash ^= hash >>> 33;
    final int mask = mKeys.length - 1;
    int i = (int) hash & mask;
    while (mKeys[i] != 0 && mKeys[i] != matrix) {
      i = (i + 1) & mask;
    }
    return i;
  }

  private boolean add(final long matrix, final int index) {
    final int slot = slot(matrix);
    if (mKeys[slot] == 0) {
      mKeys[slot] = matrix;
      mIndices[slot] = index;
      return true;
    }
    return false;
  }

  int index(final long matrix) {
    final int slot = slot(matrix);
    if (mKeys[slot] == 0) {
      throw new IllegalStateException("Matrix missing from enumerated group");
    }
    return mIndices[slot];
  }

  long matrix(final int index) {
    return mMatrices[index];
  }

  long[] matrices(final int[] ids) {
    return Arrays.stream(ids).mapToLong(this::matrix).toArray();
  }

  int multiply(final int a, final int b) {
    final byte[] action = mActions[a];
    long matrix = mMatrices[b];
    long result = 0;
    for (int i = 0; i < mN; ++i) {
      result |= (long) action[(int) matrix & mMask] << (mN * i);
      matrix >>>= mN;
    }
    return index(result);
  }

  int inverse(final int x) {
    return mInverses[x];
  }

  int[] subgroup(final long[] matrices, final int order) {
    final int[] elements = new int[order];
    final int[] generators = Arrays.stream(matrices).mapToInt(this::index).toArray();
    final BitSet seen = new BitSet(mMatrices.length);
    seen.set(0);
    int end = 1;
    for (int i = 0; i < end; ++i) {
      for (final int generator : generators) {
        final int x = multiply(elements[i], generator);
        if (!seen.get(x)) {
          seen.set(x);
          elements[end++] = x;
        }
      }
    }
    if (end != elements.length) {
      throw new IllegalStateException("Wrong generated subgroup order");
    }
    return elements;
  }

  BinaryParabolicSubgroups subgroups() {
    return classes(true);
  }

  BinaryParabolicSubgroups subgroupContainer() {
    return classes(false);
  }

  private BinaryParabolicSubgroups classes(final boolean enumerate) {
    final int[] elements = new int[mMatrices.length];
    for (int i = 0; i < elements.length; ++i) {
      elements[i] = i;
    }
    return enumerate ? BinaryParabolicSubgroups.explicit(0, elements, mGenerators, this::multiply, this::inverse)
      : BinaryParabolicSubgroups.explicitContainer(0, elements, mGenerators, this::multiply, this::inverse);
  }

  static long[] semilinearFourGenerators() {
    final long identity = BinaryLinearActions.identity(6);
    long cycle = 0;
    for (int i = 0; i < 6; ++i) {
      cycle |= 1L << (6 * i + (i + 2) % 6);
    }
    // Cycle the coordinates, add coordinate 2 to 1, multiply coordinate 1
    // by w, and apply Frobenius simultaneously (w^2 = w + 1).
    return new long[] {cycle, identity ^ (1L << 12) ^ (1L << 19),
      (identity & ~4095L) | 2 | (3 << 6), identity ^ (1L << 6) ^ (1L << 20) ^ (1L << 34)};
  }
}
