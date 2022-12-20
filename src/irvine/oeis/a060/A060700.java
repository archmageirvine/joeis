package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060700 "Anomalous" numbers k such that for even numbers 2k, gcd(2k, lcm(dd(2k)))=2k and not k, where dd(2k) is the first difference set of divisors of 2k.
 * @author Sean A. Irvine
 */
public class A060700 extends A060695 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.equals(mN)) {
        return mN.divide2();
      }
    }
  }
}
