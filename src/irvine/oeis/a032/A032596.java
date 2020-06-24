package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A032596 Three consecutive palindromic primes (middle terms).
 * @author Sean A. Irvine
 */
public class A032596 extends A002385 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final String s = p.toString();
      if ((s.length() & 1) == 1) {
        final Z p1 = A032594.bump(s);
        if (p1.isProbablePrime() && A032594.bump(p1.toString()).isProbablePrime()) {
          return p1;
        }
      }
    }
  }
}
