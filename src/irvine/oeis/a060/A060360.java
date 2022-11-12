package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a003.A003418;

/**
 * A060360 a(n) = k - (largest prime &lt; k), where k = lcm(1..n).
 * @author Sean A. Irvine
 */
public class A060360 extends A003418 {

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
    return lcm.subtract(mPrime.prevPrime(lcm));
  }
}
