package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A032594 Twin palindromic primes (upper terms).
 * @author Sean A. Irvine
 */
public class A032594 extends A002385 {

  static Z bump(final String s) {
    final String left = s.substring(0, s.length() / 2 + 1);
    final String v = new Z(left).add(1).toString();
    final String vr = new StringBuilder(v).reverse().substring(1);
    return new Z(v + vr);
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final String s = p.toString();
      if ((s.length() & 1) == 1) {
        final Z candidate = bump(s);
        if (candidate.isProbablePrime()) {
          return candidate;
        }
      }
    }
  }
}
