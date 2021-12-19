package irvine.oeis.a053;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.a025.A025475;

/**
 * A053211 Cototients of consecutive pure powers of primes.
 * @author Sean A. Irvine
 */
public class A053211 extends A025475 {

  private final PrimeDivision mFactor = new PrimeDivision();
  {
    super.next(); // skip 1
  }

  @Override
  public Z next() {
    final Z n = super.next();
    return n.subtract(mFactor.factorize(n).phi());
  }
}
