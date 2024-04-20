package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A065315 Smallest prime divisor of n-th primorial + (n+1)-st prime.
 * @author Sean A. Irvine
 */
public class A065315 extends A002110 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    return Functions.LPF.z(super.next().add(mPrime.nextPrime(mP)));
  }
}
