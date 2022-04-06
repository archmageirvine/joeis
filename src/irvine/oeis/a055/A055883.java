package irvine.oeis.a055;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000110;

/**
 * A055883 Exponential transform of Pascal's triangle A007318.
 * @author Sean A. Irvine
 */
public class A055883 extends A000110 {

  private int mN = -1;
  private int mM = 0;
  private Z mBell = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mBell = super.next();
      mM = 0;
    }
    return mBell.multiply(Binomial.binomial(mN, mM));
  }
}
