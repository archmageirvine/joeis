package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a003.A003418;

/**
 * A060358 a(n) = largest prime &lt; lcm(1..n).
 * @author Sean A. Irvine
 */
public class A060358 extends A003418 {

  private final Fast mPrime = new Fast();
  {
    setOffset(3);
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return mPrime.prevPrime(super.next());
  }
}
