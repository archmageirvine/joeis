package irvine.oeis.a001;

import irvine.factor.factor.Cheetah;
import irvine.math.IntegerUtils;
import irvine.math.MemoryFunction1;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.math.Mobius;

import java.util.ArrayList;

/**
 * A001435.
 * @author Sean A. Irvine
 */
public class A001435 extends A001430 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  private Polynomial<Q> makePoly(final int n) {
    final ArrayList<Q> coeff = new ArrayList<>();
    final Polynomial<Q> z = get(n);
    for (int k = 0; k <= z.degree(); ++k) {
      coeff.add(z.coeff(k));
    }
    return RING.create(coeff);
  }

  private class BbyFunction extends MemoryFunction1<Polynomial<Q>> {
    @Override
    protected Polynomial<Q> compute(final int n) {
      Polynomial<Q> s = RING.zero();
      if (n > 0) {
        for (int k = 1; k < n; ++k) {
          s = RING.add(s, RING.multiply(RING.multiply(makePoly(n - k), get(k)), new Q(k, n)));
        }
        s = RING.subtract(makePoly(n), s);
      }
      //System.out.println("mBby(" + n + ")=" + s);
      return s;
    }
  }

  private final MemoryFunction1<Polynomial<Q>> mBby = new BbyFunction();

  private Z b(final int n, final int m) {
    return mBby.get(n).coeff(m).toZ();
  }

  protected Z numberConnectedGraphs(final int nodes, final int edges) {
    if (nodes < 1 || edges < 0) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(IntegerUtils.gcd(nodes, edges)).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(b(nodes / d, edges / d).multiply(Mobius.mobius(d)).divide(d));
    }
    return sum;
  }

  @Override
  public Z next() {
    return numberConnectedGraphs(++mN, mN + 1);
  }

}
