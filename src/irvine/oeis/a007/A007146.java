package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.GraphCycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007146 Number of unlabeled simple connected bridgeless graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A007146 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Polynomial<Q> mD = RING.zero();
  private Polynomial<Q> mV = RING.zero();
  private Polynomial<Q> mU = RING.zero();
  private int mN = 0;

  // Eqn (4.11)
  private Q u(final Polynomial<Q> f, final int n) {
    Q u = f.coeff(n).multiply(n);
    for (int i = 1; i < n; ++i) {
      u = u.subtract(f.coeff(n - i).multiply(mU.coeff(i)));
    }
    return u;
  }

  // Eqn (4.12)
  private Q v(final Polynomial<Q> u, final int n) {
    Q sum = Q.ZERO;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(u.coeff(d).multiply(Functions.MOBIUS.i(n / d))); // differs from paper!
    }
    return sum.divide(n);
  }

  @Override
  public Z next() {
    ++mN;
    // Form A(x), eqn (4.4)
    Polynomial<Q> a = RING.x();
    for (int k = 1; k <= mD.degree(); ++k) {
      a = RING.multiply(a, RING.pow(RING.oneMinusXToTheN(k), mD.coeff(k), mN), mN);
    }
    final CycleIndex zh = GraphCycleIndex.cycleIndexUpTo(mN);
    final Polynomial<Q> f = zh.apply(a, mN);
    final CycleIndex zhp = GraphCycleIndex.cycleIndexUpToDeriv(mN);
    final Polynomial<Q> zhpax = zhp.apply(a, mN);
    // Apply eqn (4.7), newD will be a monomial
    final Polynomial<Q> newD = RING.subtract(zhpax, RING.multiply(f, mD, mN));
    mD = RING.add(mD, newD);
    mU = RING.add(mU, RING.monomial(u(f, mN), mN));
    mV = RING.add(mV, RING.monomial(v(mU, mN), mN));
    final Polynomial<Q> l = RING.add(mV, RING.multiply(RING.subtract(RING.pow(mD, 2, mN), mD.substitutePower(2, mN)), Q.HALF));
    return l.coeff(mN).toZ();
  }
}
