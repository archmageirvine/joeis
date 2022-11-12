package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a003.A003418;

/**
 * A060357 a(n) = smallest prime &gt; lcm(1..n).
 * @author Sean A. Irvine
 */
public class A060357 extends A003418 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    return mPrime.nextPrime(super.next());
  }
}
