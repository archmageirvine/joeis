package irvine.oeis.a052;

import java.util.ArrayList;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a002.A002385;
import irvine.util.Permutation;

/**
 * A052507 Take n-th palindromic prime p, let P = all primes having same digits; a(n) = q-p where q is smallest prime in P &gt;p if q exists; otherwise a(n) = p-r where r is largest prime in P &lt;p if r exists; otherwise a(n) = 0.
 * @author Sean A. Irvine
 */
public class A052507 extends A002385 {

  private final ArrayList<Z> mA = new ArrayList<>();
  private int mM = 0;

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

  private Z compute(final Z prime) {
    final Permutation perm = permuter(prime);
    int[] p;
    Z sol = prime;
    while ((p = perm.next()) != null) {
      if (p[0] != 0) {
        Z t = permToZ(p);
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
    if (++mM >= mA.size()) {
      mA.clear();
      mM = 0;
      final Z palin = super.next();
      final Permutation perm = permuter(palin);
      int[] p;
      while ((p = perm.next()) != null) {
        if (p[0] != 0) {
          final Z t = permToZ(p);
          if (t.isProbablePrime()) {
            mA.add(compute(t));
          }
        }
      }
    }
    return mA.get(mM);
  }
}
