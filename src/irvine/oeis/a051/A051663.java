package irvine.oeis.a051;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A051663 Primes p such that there is no Carmichael number pqr, p&lt;q&lt;r q, r primes.
 * @author Sean A. Irvine
 */
public class A051663 extends A000040 {

  // After Charles R Greathouse IV

  private boolean is(final Z p) {
    final Z p2 = p.square();
    for (Z a = Z.ONE; a.compareTo(p) < 0; a = a.add(1)) {
      Z b = p2.add(a).divide(a);
      while (true) {
        final Q r = new Q(b.multiply(p.add(a).subtract(1)).subtract(p), a.multiply(b).subtract(p2));
        final Q q = r.multiply(a).subtract(a).add(1).divide(p);
        if (p.compareTo(q.toZ()) >= 0) {
          break;
        }
        if (q.isInteger() && r.isInteger()) {
          final Z qz = q.toZ();
          final Z rz = r.toZ();
          if (rz.compareTo(qz) > 0 && qz.multiply(rz).mod(p.subtract(1)).equals(Z.ONE) && qz.isProbablePrime() && rz.isProbablePrime()) {
            return false;
          }
        }
        b = b.add(1);
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p)) {
        return p;
      }
    }
  }
}
