package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a003.A003418;

/**
 * A060361 a(n) = { Smallest prime &gt; k } - k, where k = lcm(1..n).
 * @author Sean A. Irvine
 */
public class A060361 extends A003418 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final Z lcm = super.next();
    return mPrime.nextPrime(lcm).subtract(lcm);
  }
}
