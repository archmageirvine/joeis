package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A065316 Largest prime divisor of n-th primorial - (n+1)-st prime.
 * @author Sean A. Irvine
 */
public class A065316 extends A002110 {

  {
    super.next();
    super.next();
    super.next();
    setOffset(3);
  }

  @Override
  public Z next() {
    return Functions.GPF.z(super.next().subtract(mPrime.nextPrime(mP)));
  }
}
