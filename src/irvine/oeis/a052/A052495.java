package irvine.oeis.a052;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;
import irvine.util.Permutation;

/**
 * A052495 Take n-th prime p, let P = all primes having same digits; a(n) = q-p where q is smallest prime in P &gt;p if q exists; otherwise a(n) = p-r where r is largest prime in P &lt;p if r exists; otherwise a(n) = 0.
 * @author Sean A. Irvine
 */
public class A052495 extends A000040 {

  static Permutation permuter(final Z prime) {
    final int[] cnts = ZUtils.digitCounts(prime);
    final int sum = (int) IntegerUtils.sum(cnts);
    final int[] digits = new int[sum];
    for (int k = 0, i = 0; k < cnts.length; ++k) {
      for (int j = 0; j < cnts[k]; ++j) {
        digits[i++] = k;
      }
    }
    return new Permutation(digits);
  }

  static Z permToZ(final int[] p) {
    Z t = Z.ZERO;
    for (int v : p) {
      t = t.multiply(10).add(v);
    }
    return t;
  }

  static Z compute(final Z prime) {
    final Permutation perm = permuter(prime);
    int[] p;
    Z sol = prime;
    while ((p = perm.next()) != null) {
      if (p[0] != 0) {
        final Z t = permToZ(p);
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
