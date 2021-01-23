package irvine.oeis.a036;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a025.A025487;

/**
 * A036041 Number of prime divisors, counted with multiplicity, of prime signature A025487(n); equals size of associated partition.
 * @author Sean A. Irvine
 */
public class A036041 extends A025487 {

  private final PrimeDivision mFactor = new PrimeDivision();

  @Override
  public Z next() {
    return Z.valueOf(mFactor.factorize(super.next()).bigOmega());
  }
}

