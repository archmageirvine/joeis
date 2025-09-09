package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A032593 Lesser of two consecutive palindromes, both of which are prime.
 * @author Sean A. Irvine
 */
public class A032593 extends A002385 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final String s = p.toString();
      if ((s.length() & 1) == 1 && A032594.bump(s).isProbablePrime()) {
        return p;
      }
    }
  }
}
