package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a051.A051451;

/**
 * A058018 Difference between LCM(1,...,x) and the smallest prime &gt; LCM(1,...,x), where x is the n-th prime power (A000961).
 * @author Sean A. Irvine
 */
public class A058018 extends A051451 {

  @Override
  public Z next() {
    final Z lcm = super.next();
    return mPrime.nextPrime(lcm).subtract(lcm);
  }
}
