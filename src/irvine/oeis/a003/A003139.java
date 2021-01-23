package irvine.oeis.a003;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003139 Number of coprime chains with largest member n.
 * @author Sean A. Irvine
 */
public class A003139 implements Sequence {

  // After Charles R Greathouse IV

  protected final Fast mPrime = new Fast();
  private int mN = 0;

  private boolean isCoprimeChain(final int[] set, final int length) {
    for (long p = 2; p <= set[length - 1]; p = mPrime.nextPrime(p)) {
      boolean seen = false;
      for (int j = 0; j < length; ++j) {
        final int v = set[j];
        if (v % p == 0) {
          if (seen) {
            return false;
          }
          seen = true;
        }
      }
      if (!seen) {
        return false;
      }
    }
    return true;
  }

  private int extract(final int[] src, final int[] dest, final long selector) {
    int pos = 0;
    int k = 0;
    for (long s = selector; s != 0; s >>>= 1, ++k) {
      if ((s & 1) != 0) {
        dest[pos++] = src[k];
      }
    }
    return pos;
  }

  protected int nextLength(final int n) {
    return n + 1;
  }

  @Override
  public Z next() {
    mN = nextLength(mN);
    if (mN == 1) {
      return Z.ONE;
    }
    long c = 0;
    final int[] vec = new int[mN - 1];
    final int[] work = new int[mN - 1];
    for (int k = 0; k < vec.length; ++k) {
      vec[k] = k + 2;
    }
    for (long selector = 1L << (mN - 2); selector < 1L << (mN - 1); ++selector) {
      final int len = extract(vec, work, selector);
      if (isCoprimeChain(work, len)) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
