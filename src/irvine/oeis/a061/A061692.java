package irvine.oeis.a061;

import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061692 Triangle of generalized Stirling numbers.
 * @author Sean A. Irvine
 */
public class A061692 extends Sequence1 {

  // After Alois P. Heinz

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private int mM = 0;

  private final MemoryFunction1<Polynomial<Q>> mB = new MemoryFunction1<>() {
    @Override
    protected Polynomial<Q> compute(final int n) {
      return n == 0
        ? RING.one()
        : RING.sum(1, n, i -> RING.multiply(get(n - i).shift(1), new Q(Z.ONE, Functions.FACTORIAL.z(i).pow(3))));
    }
  };

  protected Z t(final int n, final int m) {
    return mB.get(n).coeff(m)
      .multiply(Functions.FACTORIAL.z(n).pow(3))
      .divide(Functions.FACTORIAL.z(m))
      .toZ();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}

