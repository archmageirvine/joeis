package irvine.oeis.a055;

import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.SkipSequence;
import irvine.oeis.a007.A007318;

/**
 * A055375 Euler transform of Pascal's triangle A007318.
 * @author Sean A. Irvine
 */
public class A055375 extends Sequence0 {

  private Polynomial<Polynomial<Z>> mGf = null;
  private int mN = -1;
  private int mM = -1;

  protected Sequence getUnderlyingSequence() {
    return new SkipSequence(new A007318(), 1);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      final PolynomialRingField<Z> ringY = new DegreeLimitedPolynomialRingField<>(IntegerField.SINGLETON, mN);
      final PolynomialRingField<Polynomial<Z>> ring = new PolynomialRingField<>(ringY);
      Polynomial<Polynomial<Z>> prod = ring.one();
      final Sequence seq = getUnderlyingSequence();
      for (int k = 1; k <= mN; ++k) {
        for (int j = 0; j <= k; ++j) {
          prod = ring.multiply(prod, ring.pow(ring.oneMinusXToTheN(ringY.monomial(Z.ONE, j), k), seq.next().intValueExact()), mN);
        }
      }
      mGf = ring.series(ring.one(), prod, mN);
    }
    return mGf.coeff(mN).coeff(mM);
  }
}
