package irvine.oeis.a006;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.polynomial.MultivariatePolynomial;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A006947 Two-rowed truncated monotone triangles.
 * @author Sean A. Irvine
 */
public class A006947 extends Sequence1 {

  // After Doron Zeilberger, ROBBINS Maple package

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private boolean checkA(final int[] a) {
    for (int i = 0; i < a.length - 1; ++i) {
      if (a[i] < a[i + 1]) {
        return false;
      }
    }
    return true;
  }

  private boolean checkB(final int[] a, final int n) {
    for (int i = 0; i < a.length - 1; ++i) {
      if (a[i] > n - i) {
        return false;
      }
    }
    return true;
  }

  private final Map<String, Z> mBCache = new HashMap<>();

  private Z computeB(final int k, final int n, final int[] a) {
    assert k >= 1 && k <= n && a.length == k;
    assert n >= a[0] && a[k - 1] >= 1;
    assert checkA(a);
    assert checkB(a, n);

    if (n == 1 && k == 1) {
      return Z.ONE;
    }

    if (n == k) {
      assert a[k - 1] == 1;
      return b(k - 1, k, Arrays.copyOf(a, k - 1));
    }

    /*
     * gu is a polynomial in x[1], ... x[k] the coeff. of each monomial of
     * is 1, and such the monomials are t x[1]^b_1 ... x_[k]^b_k
     * for all b=(b_1, ... ,b_k) in eq. (1) of the paper on Act  I:
     * Counting Magog)
     */

    MultivariatePolynomial<Z> gu = MultivariatePolynomial.one(IntegerField.SINGLETON, k);
    for (int i = 1; i < k; ++i) {
      final Polynomial<Z> normal = RING.divide(RING.oneMinusXToTheN(Math.min(a[i - 1], n - i) - a[i] + 1), RING.oneMinusXToTheN(1));
      final Polynomial<Z> m = normal.shift(a[i]);
      gu = gu.multiply(MultivariatePolynomial.create(IntegerField.SINGLETON, m, i - 1, k));
    }
    final Polynomial<Z> normal = RING.divide(RING.oneMinusXToTheN(Math.min(a[k - 1], n - k)), RING.oneMinusXToTheN(1));
    final Polynomial<Z> m = normal.shift(1);
    gu = gu.multiply(MultivariatePolynomial.create(IntegerField.SINGLETON, m, k - 1, k));

    Z sum = Z.ZERO;
    for (final MultivariatePolynomial.Term mu : gu.keySet()) {
      final int[] b = new int[k];
      for (int i = 0; i < k; ++i) {
        b[i] = mu.get(i);
      }
      sum = sum.add(b(k, n - 1, b));
    }
    return sum;
  }

  // A recursive construction of the monomials
  private void build(final int n, final List<MultivariateMonomial> res, final MultivariateMonomial mm, final int k, final int ak) {
    if (k == 0) {
      res.add(mm);
      return;
    }
    for (int j = ak; j <= n - k + 1; ++j) {
      final MultivariateMonomial cmm = mm.copy();
      cmm.multiply(MultivariateMonomial.create(k, j));
      build(n, res, cmm, k - 1, j);
    }
  }

  private Z b(final int k, final int n, final int[] a) {
    final String key = k + Arrays.toString(a) + n;
    final Z res = mBCache.get(key);
    if (res != null) {
      return res;
    }
    final Z r = computeB(k, n, a);
    mBCache.put(key, r);
    return r;
  }

  /*
   * Gives the sum of all monomials x_1^a_1 ... x_k^a_k
   * for which  n>=a_1 >= ...>= a_k>=1 and a_i<=n-i+1 , which are
   * all the conceivable (k,n,[a_1, ... , a_k]) contributing a non-zero
   * term to the total b_k(n) of n by k Magog trapezoids (First equality of George)
   */
  private List<MultivariateMonomial> polmagog(final int k, final int n) {
    final ArrayList<MultivariateMonomial> res = new ArrayList<>();
    build(n, res, new MultivariateMonomial(), k, 1);
    return res;
  }

  private Z b(final int k, final int n) {
    final List<MultivariateMonomial> gu = polmagog(k, n);
    Z sum = Z.ZERO;
    for (final MultivariateMonomial mu : gu) {
      final int[] a = new int[k];
      for (int i = 1; i <= k; ++i) {
        a[i - 1] = mu.get(new Pair<>(MultivariateMonomial.DEFAULT_VARIABLE, i)).intValueExact();
      }
      sum = sum.add(b(k, n, a));
    }
    return sum;
  }

  private int mN = 1;

  @Override
  public Z next() {
    return b(2, ++mN);
  }
}
