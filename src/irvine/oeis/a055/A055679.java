package irvine.oeis.a055;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a048.A048855;

/**
 * A055679 Number of distinct prime factors of phi(n!).
 * @author Sean A. Irvine
 */
public class A055679 extends A048855 {

  private final PrimeDivision mFactor = new PrimeDivision();
  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(mFactor.factorize(super.next()).omega());
  }
}
