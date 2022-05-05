package irvine.oeis.a056;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;

/**
 * A056673 Number of unitary and squarefree divisors of binomial(n, floor(n/2)). Also the number of divisors of the powerfree part of A001405(n), A056060(n).
 * @author Sean A. Irvine
 */
public class A056673 extends A056060 {

  private final PrimeDivision mFactor = new PrimeDivision();

  @Override
  public Z next() {
    return mFactor.factorize(super.next()).sigma0();
  }
}
