package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A059694 Primes p such that 1p1, 3p3, 7p7 and 9p9 are all primes.
 * @author Sean A. Irvine
 */
public class A059694 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      final String s = n.toString();
      if (new Z("1" + s + "1").isProbablePrime()
        && new Z("3" + s + "3").isProbablePrime()
        && new Z("7" + s + "7").isProbablePrime()
        && new Z("9" + s + "9").isProbablePrime()) {
        return n;
      }
    }
  }
}
