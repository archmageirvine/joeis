package irvine.oeis.a160;

import irvine.math.cyclotomic.CyclotomicPolynomials;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A160338 Height (maximum absolute value of coefficients) of the n-th cyclotomic polynomial.
 * @author Georg Fischer
 */
public class A160338 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A160338() {
    super(1);
  }

  @Override
  public Z next() {
    return PolynomialUtils.height(CyclotomicPolynomials.cyclotomic(++mN));
  }
}
