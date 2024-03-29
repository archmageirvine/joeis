package irvine.oeis.a053;

import irvine.math.polynomial.ChebyshevPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A053117 Triangle read by rows of coefficients of Chebyshev's U(n,x) polynomials (exponents in increasing order).
 * @author Sean A. Irvine
 */
public class A053117 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A053117(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A053117() {
    super(0);
  }

  private final ChebyshevPolynomials mChebyshevPolynomials = new ChebyshevPolynomials(2);
  private Polynomial<Z> mPoly = mChebyshevPolynomials.getValue(0);
  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mPoly.degree()) {
      mPoly = mChebyshevPolynomials.getValue(++mN);
      mM = 0;
    }
    return mPoly.coeff(mM);
  }
}
