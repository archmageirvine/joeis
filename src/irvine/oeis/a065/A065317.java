package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A065317 Largest prime divisor of the sum of the n-th primorial and the (n+1)-st prime.
 * @author Sean A. Irvine
 */
public class A065317 extends A002110 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    return Jaguar.factor(super.next().add(mPrime.nextPrime(mP))).largestPrimeFactor();
  }
}
