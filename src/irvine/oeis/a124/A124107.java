package irvine.oeis.a124;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A124107 Numbers n such that n is the sum of the augmenting factorials of the digits of n, e.g. 733 = 7 + 3! + (3!)!.
 * @author Sean A. Irvine
 */
public class A124107 implements Sequence {

  private long mN = 0;

  // Big enough for all longs
  private static final int MAX = 20;
  private static final long[][] ITERATED_FACTORIAL = new long[MAX][MAX];
  static {
    for (int k = 0; k < MAX; ++k) {
      ITERATED_FACTORIAL[0][k] = k;
    }
    final MemoryFactorial f = MemoryFactorial.SINGLETON;
    for (int k = 1; k < MAX; ++k) {
      for (int j = 0; j < MAX; ++j) {
        final long v = ITERATED_FACTORIAL[k - 1][j];
        ITERATED_FACTORIAL[k][j] = v == -1 || v >= 20 ? -1 : f.factorial((int) v).longValue();
      }
    }
  }

  private boolean test(final long n) {
    int c = 0;
    long h = 10;
    while (n > h) {
      ++c;
      h *= 10;
    }
    long u = n;
    long s = 0;
    while (c >= 0) {
      final long q = ITERATED_FACTORIAL[c][(int) (u % 10)];
      if (q < 0) {
        return false;
      }
      s += q;
      if (s > n) {
        return false;
      }
      u /= 10;
      --c;
    }
    return s == n;
  }

  @Override
  public Z next() {
    while (true) {
      if (test(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

