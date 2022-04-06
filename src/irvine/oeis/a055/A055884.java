package irvine.oeis.a055;

import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a008.A008284;

/**
 * A055884 Euler transform of partition triangle A008284.
 * @author Sean A. Irvine
 */
public class A055884 implements Sequence {

  // Cf. A055375 but enough offsets etc. changed here to make it easier this way

  private Polynomial<Polynomial<Z>> mGf = null;
  private int mN = 0;
  private int mM = 0;

  protected Sequence getUnderlyingSequence() {
    return new A008284();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      final PolynomialRingField<Z> ringY = new DegreeLimitedPolynomialRingField<>(IntegerField.SINGLETON, mN);
      final PolynomialRingField<Polynomial<Z>> ring = new PolynomialRingField<>(ringY);
      Polynomial<Polynomial<Z>> prod = ring.one();
      final Sequence seq = getUnderlyingSequence();
      for (int k = 1; k <= mN; ++k) {
        for (int j = 1; j <= k; ++j) {
          prod = ring.multiply(prod, ring.pow(ring.oneMinusXToTheN(ringY.monomial(Z.ONE, j), k), seq.next().intValueExact()), mN);
        }
      }
      mGf = ring.series(ring.one(), prod, mN);
    }
    return mGf.coeff(mN).coeff(mM);
  }
}
