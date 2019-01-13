package irvine.oeis.a007;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.GraphCycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007145.
 * @author Sean A. Irvine
 */
public class A007145 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Polynomial<Q> mD = RING.zero();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    // Form A(x), eqn (4.4)
    Polynomial<Q> a = RING.x();
    for (int k = 1; k <= mD.degree(); ++k) {
      a = RING.multiply(a, RING.pow(RING.oneMinusXToTheN(k), mD.coeff(k), mN), mN);
    }
    final CycleIndex zh = GraphCycleIndex.cycleIndexUpTo(mN);
    final Polynomial<Q> zhax = zh.apply(a, mN);
    final CycleIndex zhp = GraphCycleIndex.cycleIndexUpToDeriv(mN);
    final Polynomial<Q> zhpax = zhp.apply(a, mN);
    // Apply eqn (4.7), newD will be a monomial
    final Polynomial<Q> newD = RING.subtract(zhpax, RING.multiply(zhax, mD, mN));
    mD = RING.add(mD, newD);
    return newD.coeff(mN).toZ();
  }
}
