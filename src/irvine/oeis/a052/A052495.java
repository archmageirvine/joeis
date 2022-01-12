package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.Permutation;

/**
 * A052495 Take n-th prime p, let P = all primes having same digits; a(n) = q-p where q is smallest prime in P &gt;p if q exists; otherwise a(n) = p-r where r is largest prime in P &lt;p if r exists; otherwise a(n) = 0.
 * @author Sean A. Irvine
 */
public class A052495 extends A000040 {

  static Z compute(final Z prime) {
    final Permutation perm = Permutation.permuter(prime);
    int[] p;
    Z sol = prime;
    while ((p = perm.next()) != null) {
      if (p[0] != 0) {
        final Z t = Permutation.permToZ(p);
        if (t.isProbablePrime()) {
          final int c = t.compareTo(prime);
          if (c > 0) {
            return t.subtract(prime);
          } else if (c < 0) {
            sol = t;
          }
        }
      }
    }
    return prime.subtract(sol);
  }

  @Override
  public Z next() {
    return compute(super.next());
  }
}
