package irvine.oeis.a055;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A055768 Number of distinct primes dividing phi of n-th primorial number.
 * @author Sean A. Irvine
 */
public class A055768 extends A002110 {

  private final PrimeDivision mFactor = new PrimeDivision();
  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(mFactor.factorize(mFactor.factorize(super.next()).phi()).omega());
  }
}
