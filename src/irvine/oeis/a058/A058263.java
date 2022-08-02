package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a006.A006093;

/**
 * A058263 a(n) = gcd(prime(n) - 1, prime(n+1) - 1).
 * @author Sean A. Irvine
 */
public class A058263 extends A006093 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.gcd(t);
  }
}
