package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000294 Expansion of g.f. Product_{k &gt;= 1} (1 - x^k)^(-k*(k+1)/2).
 * @author Sean A. Irvine
 */
public class A000294 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    // Do the run up each time rather than remembering in extended precision
    Polynomial<Z> t = RING.one();
    for (int k = 1; k <= mN; ++k) {
      t = RING.multiply(t, RING.pow(RING.oneMinusXToTheN(k), k * (k + 1) / 2, mN), mN);
    }
    return RING.coeff(RING.one(), t, mN);
  }
}
