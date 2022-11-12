package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a003.A003418;

/**
 * A060362 a(n) = Min { { smallest prime &gt; k } - k, k - { largest prime &lt; k } }, where k = lcm(1..n) = A003418(n).
 * @author Sean A. Irvine
 */
public class A060362 extends A003418 {

  private final Fast mPrime = new Fast();
  {
    setOffset(3);
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final Z lcm = super.next();
    return mPrime.nextPrime(lcm).subtract(lcm).min(lcm.subtract(mPrime.prevPrime(lcm)));
  }
}
