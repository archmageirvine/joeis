package irvine.oeis.a028;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.IntegerUtils;
import irvine.math.MemoryFunction2;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A028657 Triangle read by rows: T(n,k) = number of n-node graphs with k nodes in distinguished bipartite block, k = 0..n.
 * @author Sean A. Irvine
 */
public class A028657 extends MemoryFunction2Sequence<Integer, Z> {

  /** Construct the sequence. */
  public A028657() {
    this(0);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A028657(final int offset) {
    super(offset);
  }

  // After Alois P. Heinz

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  private final MemoryFunction2<Integer, List<Polynomial<Z>>> mB = new MemoryFunction2<>() {
    @Override
    protected List<Polynomial<Z>> compute(final Integer n, final Integer m) {
      if (n == 0) {
        return Collections.singletonList(RING.zero());
      }
      if (m < 1) {
        return Collections.emptyList();
      }
      final List<Polynomial<Z>> res = new ArrayList<>();
      for (int j = 0; j <= n / m; ++j) {
        for (final Polynomial<Z> p : get(n - m * j, m - 1)) {
          res.add(RING.add(p, RING.monomial(Z.valueOf(j), m)));
        }
      }
      return res;
    }
  };

  private Z prod(final Polynomial<Z> p) {
    Z prod = Z.ONE;
    for (int k = 1; k <= p.degree(); ++k) {
      prod = prod.multiply(Z.valueOf(k).pow(p.coeff(k))).multiply(Functions.FACTORIAL.z(p.coeff(k)));
    }
    return prod;
  }

  @Override
  protected Z compute(final Integer n, final Integer k) {
    Q sum = Q.ZERO;
    for (final Polynomial<Z> s : mB.get(n, n)) {
      final Z s2 = prod(s);
      for (final Polynomial<Z> t : mB.get(n + k, n + k)) {
        final Z t2 = prod(t);
        Z u = Z.ZERO;
        for (int j = 1; j <= t.degree(); ++j) {
          for (int i = 1; i <= s.degree(); ++i) {
            final int g = IntegerUtils.gcd(i, j);
            u = u.add(s.coeff(i).multiply(t.coeff(j)).multiply(g));
          }
        }
        final Z r = Z.ONE.shiftLeft(u.longValueExact());
        sum = sum.add(new Q(r, t2.multiply(s2)));
      }
    }
    return sum.toZ();
  }

  protected Z a(final int n, final int k) {
    return get(Math.min(n, k), Math.abs(n - k));
  }

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return a(mM, mN - mM);
  }
}
