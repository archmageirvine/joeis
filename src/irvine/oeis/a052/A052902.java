package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.Permutation;

/**
 * A052902 Take n-th prime p, let P = all primes that can be obtained by permuting the digits of p and possibly omitting zeros; a(n) = |p-q| where q in P is the closest to p but different from p (a(n)=0 if no such q exists).
 * @author Sean A. Irvine
 */
public class A052902 extends A000040 {

  @Override
  public Z next() {
    final Z prime = super.next();
    if (prime.compareTo(Z.TEN) < 0) {
      return Z.ZERO;
    }
    Z diff = null;
    final Permutation perm = Permutation.permuter(prime);
    int[] p;
    while ((p = perm.next()) != null) {
      final Z v = Permutation.permToZ(p);
      if (!v.equals(prime) && v.isProbablePrime()) {
        final Z d = prime.subtract(v).abs();
        if (diff == null || d.compareTo(diff) < 0) {
          diff = d;
        }
      }
    }
    return diff == null ? Z.ZERO : diff;
  }
}
