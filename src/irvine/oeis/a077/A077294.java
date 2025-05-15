package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077294 a(n) = A077293(n)/n.
 * @author Sean A. Irvine
 */
public class A077294 extends Sequence1 {

  private long mLim = 10;
  private long mM = 0;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z v = Z.ZERO;
    while (true) {
      if (++mM == mLim) {
        mLim *= 10;
      }
      v = v.multiply(mLim).add(mM);
      if (v.mod(mN) == 0 && !v.equals(mN)) {
        return v.divide(mN);
      }
    }
  }
}
