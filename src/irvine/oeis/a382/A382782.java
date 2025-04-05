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
    // Coefficient of 1/(2k +/- 1)^j in the partial fraction decomposition of 1/((2k-1)^n*(2k+1)^n))
    return new Q(Binomial.binomial(2L * n - j - 1, n - 1), Z.ONE.shiftLeft(2L * n - j));
  }

  protected void step() {
    // Computes next row of the triangle
    ++mN;
    mM = 0;
    mRow = RING.zero();
    for (int j = 1; j <= mN; ++j) {
      final Q c = c(mN, j);
      mRow = RING.add(mRow, RING.monomial(c.multiply(Z.NEG_ONE.pow(mN + 1)), 0)); // take the k=1 term from the 1/(2k-1)^j sum
      if ((j & 1) == 0) {
        // sum(1/(2k-1)^j,k=1..infinity) + sum(1/(2k+1)^j,k=1..infinity)
        // = 1 + 2 * sum(1/(2k+1)^j,k=1..infinity)
        final Q b = mB.get(j).abs().multiply(Z.ONE.shiftLeft(j).subtract(1)).divide(Functions.FACTORIAL.z(j).multiply2()).multiply(Z.NEG_ONE.pow(mN)).multiply(2).multiply(c);
        final int i = j / 2; // pi^j -> x^i
        mRow = RING.add(mRow, RING.monomial(b, i));
      }
    }
    // Precompute lcm of denominators (used to make "reduced" integer coefficient)
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
