package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085388 First differences of n^k.
 * @author Sean A. Irvine
 */
public class A085388 extends Sequence1 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long k) {
    if (k == 0) {
      return Z.ONE;
    }
    if (n == 1) {
      return Z.ZERO;
    }
    return Z.valueOf(n).pow(k - 1).multiply(n - 1);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM + 1, mM);
  }
}
