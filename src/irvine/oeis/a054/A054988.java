package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a006.A006862;

/**
 * A054988 Number of prime divisors of 1 + (product of first n primes), with multiplicity.
 * @author Sean A. Irvine
 */
public class A054988 extends A006862 {

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    return Functions.BIG_OMEGA.z(super.next());
  }
}
