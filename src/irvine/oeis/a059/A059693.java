package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A059693 Palindromes n such that 1n1, 3n3, 7n7 and 9n9 are all primes.
 * @author Sean A. Irvine
 */
public class A059693 extends A002113 {

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
