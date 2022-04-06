package irvine.oeis.a055;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A055769 Largest prime dividing phi of the n-th primorial.
 * @author Sean A. Irvine
 */
public class A055769 extends A002110 {

  private final PrimeDivision mFactor = new PrimeDivision();
  {
    super.next();
  }

  @Override
  public Z next() {
    final Z[] p = mFactor.factorize(mFactor.factorize(super.next()).phi()).toZArray();
    return p.length == 0 ? Z.ONE : p[p.length - 1];
  }
}
