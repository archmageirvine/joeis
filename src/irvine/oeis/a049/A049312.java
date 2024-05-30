package irvine.oeis.a049;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.math.MemoryFunction2;
import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A049312 Number of graphs with a distinguished bipartite block, by number of vertices.
 * @author Sean A. Irvine
 */
public class A049312 extends MemoryFunction2Sequence<Integer, Z> {

  // After Alois P. Heinz

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final class BFunction extends MemoryFunction2<Integer, Set<Polynomial<Z>>> {

    @Override
    protected Set<Polynomial<Z>> compute(final Integer n, final Integer i) {
      if (n == 0) {
        return Collections.singleton(RING.zero());
      } else if (i < 1) {
        return Collections.emptySet();
      }
      final HashSet<Polynomial<Z>> res = new HashSet<>();
      for (int j = 0; j <= n / i; ++j) {
        for (final Polynomial<Z> p : get(n - i * j, i - 1)) {
          res.add(RING.add(p, RING.monomial(Z.valueOf(j), i)));
        }
      }
      return res;
    }
  }

  private final BFunction mB = new BFunction();
  private int mN = -1;

  private Z mul(final Polynomial<Z> p) {
    Z prod = Z.ONE;
    for (int i = 1; i <= p.degree(); ++i) {
      final int c = p.coeff(i).intValueExact();
      prod = prod.multiply(Z.valueOf(i).pow(c).multiply(Functions.FACTORIAL.z(c)));
    }
    return prod;
  }

  // g function
  @Override
  protected Z compute(final Integer n, final Integer k) {
    Q sum = Q.ZERO;
    for (final Polynomial<Z> s : mB.get(n, n)) {
      for (final Polynomial<Z> t : mB.get(n + k, n + k)) {
        int shift = 0;
        for (int i = 1; i <= s.degree(); ++i) {
          final int cs = s.coeff(i).intValueExact();
          for (int j = 1; j <= t.degree(); ++j) {
            shift += Functions.GCD.i(i, j) * cs * t.coeff(j).intValueExact();
          }
        }
        sum = sum.add(new Q(Z.ONE.shiftLeft(shift), mul(s).multiply(mul(t))));
      }
    }
    return sum.toZ();
  }

  private Z a(final int n, final int k) {
    return get(Math.min(n, k), Math.abs(n - k));
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int d = 0; d <= mN; ++d) {
      sum = sum.add(a(d, mN - d));
    }
    return sum;
  }
}
