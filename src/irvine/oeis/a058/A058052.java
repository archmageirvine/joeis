package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058052 Sum of the distances between the 2^n vertices in the De Bruijn Graphs on words of length n on alphabet {0,1}.
 * @author Sean A. Irvine
 */
public class A058052 implements Sequence {

  // After Michael S. Branicky

  private int mN = 0;

  private int d(final long x, final long y, final int n) {
    long mask = (1L << n) - 1;
    for (int k = 0; k < n; ++k, mask >>>= 1) {
      if ((x & mask) == (y >>> k)) {
        return k;
      }
    }
    return n;
  }

  @Override
  public Z next() {
    ++mN;
    long sum = 0;
    for (long x = 0; x < 1L << (mN - 1); ++x) {
      for (long y = 0; y < 1L << mN; ++y) {
        sum += d(x, y, mN);
      }
    }
    return Z.valueOf(sum).multiply2();
  }
}
