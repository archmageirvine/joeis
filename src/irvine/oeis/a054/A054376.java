package irvine.oeis.a054;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.ChebyshevPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054376 Table of resultants for Chebyshev polynomials U_k(x) and U_n(x).
 * @author Sean A. Irvine
 */
public class A054376 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final ChebyshevPolynomials mChebyshevPolynomials = new ChebyshevPolynomials(2);
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    final Polynomial<Z> a = mChebyshevPolynomials.getValue(mN);
    final Polynomial<Z> b = mChebyshevPolynomials.getValue(mM);
    return RING.resultant(a, b);
  }
}
