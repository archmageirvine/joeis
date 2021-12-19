package irvine.oeis.a053;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a025.A025475;

/**
 * A053198 Totients of consecutive pure powers of primes.
 * @author Sean A. Irvine
 */
public class A053198 extends A025475 {

  private final PrimeDivision mFactor = new PrimeDivision();
  {
    super.next(); // skip 1
  }

  @Override
  public Z next() {
    return mFactor.factorize(super.next()).phi();
  }
}
