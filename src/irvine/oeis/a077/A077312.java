package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077312 Smallest k such that the concatenation of natural numbers from (n+1) to k is a multiple of n.
 * @author Sean A. Irvine
 */
public class A077312 extends Sequence1 {

  private long mLim = 10;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == mLim) {
      mLim *= 10;
    }
    Z v = Z.ZERO;
    long k = mN;
    long m = mLim;
    while (true) {
      if (++k == m) {
        m *= 10;
      }
      v = v.multiply(m).add(k);
      if (v.mod(mN) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
