package irvine.oeis.a382;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A382782.
 * @author Sean A. Irvine
 */
public class A382782 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private int mM = 0;
  private Polynomial<Q> mRow = RING.zero();
  protected Z mLcm = Z.ONE;
  private final BernoulliSequence mB = new BernoulliSequence(0);

  private Q c(final int n, final int j) {
    return new Q(Binomial.binomial(2L * n - j - 1, n - 1), Z.ONE.shiftLeft(2L * n - j));
  }

  protected void step() {
    ++mN;
    mM = 0;
    mRow = RING.zero();
    for (int j = 1; j <= mN; ++j) {
      final Q c = c(mN, j);
      if ((j & 1) == 1) {
        // 1/(2k-1)^j - 1/(2k+1)^j
        mRow = RING.add(mRow, RING.monomial(c.multiply(Z.NEG_ONE.pow(mN + 1)), 0));
      } else {
        assert (j & 1) == 0;
        // sum(1/(2k-1)^j,k=1..infinity) + sum(1/(2k+1)^j,k=1..infinity)
        // = 1 + 2 * sum(1/(2k+1)^j,k=1..infinity)
        mRow = RING.add(mRow, RING.monomial(c.multiply(Z.NEG_ONE.pow(mN + 1)), 0));
        final Q b = mB.get(j).abs().multiply(Z.ONE.shiftLeft(j).subtract(1)).divide(Functions.FACTORIAL.z(j).multiply2()).multiply(Z.NEG_ONE.pow(mN)).multiply(2).multiply(c);
        final int i = j / 2; // pi^j -> x^i
        mRow = RING.add(mRow, RING.monomial(b, i));
      }
    }
    // Pre-compute lcm of denominators (used to make coefficient integer)
    mLcm = Z.ONE;
    for (final Q t : mRow) {
      mLcm = mLcm.lcm(t.den());
    }
  }

  protected Z select(final int n, final Q coeff) {
    return coeff.multiply(mLcm).toZ();
  }

  @Override
  public Z next() {
    if (++mM > mRow.degree()) {
      step();
    }
    return select(mN, mRow.coeff(mM));
  }
}
