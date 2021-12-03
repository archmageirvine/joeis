package irvine.oeis.a052;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;
import irvine.util.Permutation;

/**
 * A052902 Take n-th prime p, let P = all primes that can be obtained by permuting the digits of p and possibly omitting zeros; a(n) = |p-q| where q in P is the closest to p but different from p (a(n)=0 if no such q exists).
 * @author Sean A. Irvine
 */
public class A052902 extends A000040 {

  private Permutation permuter(final Z prime) {
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

  private Z permToZ(final int[] p) {
    Z t = Z.ZERO;
    for (int v : p) {
      t = t.multiply(10).add(v);
    }
    return t;
  }

  @Override
  public Z next() {
    final Z prime = super.next();
    if (prime.compareTo(Z.TEN) < 0) {
      return Z.ZERO;
    }
    Z diff = null;
    final Permutation perm = permuter(prime);
    int[] p;
    while ((p = perm.next()) != null) {
      final Z v = permToZ(p);
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
