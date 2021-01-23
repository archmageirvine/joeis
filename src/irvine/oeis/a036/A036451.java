package irvine.oeis.a036;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a002.A002182;

/**
 * A036451 Maximal value of d(x) (the number of divisors of x, A000005) if the binary order (see A029837) of x, the value g(x) = n.
 * @author Sean A. Irvine
 */
public class A036451 extends A002182 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private Z mLim = null;
  private Z mA = super.next();

  @Override
  public Z next() {
    mLim = mLim == null ? Z.ONE : mLim.multiply2();
    Z sigma0 = Z.ZERO;
    while (mA.compareTo(mLim) <= 0) {
      sigma0 = sigma0.max(mFactor.factorize(mA).sigma0());
      mA = super.next();
    }
    return sigma0;
  }
}

