package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068686 Let p = abc..k be a prime in base 10. Define mirror(p) = abc...k...cba. Sequence gives primes of the form mirror(p) for some p.
 * @author Sean A. Irvine
 */
public class A068686 extends A000040 {

  {
    super.skip(4); // 2..7
  }

  @Override
  public Z next() {
    while (true) {
      Z t = super.next();
      final String s = t.toString();
      for (int k = s.length() - 2; k >= 0; --k) {
        t = t.multiply(10).add(s.charAt(k) - '0');
      }
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
