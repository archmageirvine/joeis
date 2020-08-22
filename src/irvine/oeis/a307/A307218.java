package irvine.oeis.a307;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A307218 Numbers x with k digits in base 2 (MSD(x)_2 = d_1, LSD(x)_2 = d_k) that are equal to the product of the positions of 1's (see examples and formula).
 * @author Sean A. Irvine
 */
public class A307218 implements Sequence {

  private long mN = 0;

  private boolean isA307218(final long n) {
    long p = 1;
    int k = Long.SIZE - Long.numberOfLeadingZeros(n);
    long m = n;
    while (m != 0 && p <= n) {
      if ((m & 1) == 1) {
        p *= k;
      }
      --k;
      m >>>= 1;
    }
    return p == n;
  }

  @Override
  public Z next() {
    while (true) {
      if (isA307218(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
