package irvine.oeis.a054;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.HermitePolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054373 Table of resultants for Hermite polynomials H_k(x) and H_n(x).
 * @author Sean A. Irvine
 */
public class A054373 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final HermitePolynomials mHermitePolynomials = new HermitePolynomials();
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    final Polynomial<Z> a = mHermitePolynomials.getValue(mN);
    final Polynomial<Z> b = mHermitePolynomials.getValue(mM);
    return RING.resultant(a, b);
  }
}
