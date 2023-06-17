package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A022225 Gaussian binomial coefficients [ n, 7 ] for q = 6.
 * @author Sean A. Irvine
 */
public class A022225 extends AbstractSequence {

  /* Construct the sequence. */
  public A022225() {
    super(7);
  }

  private int mN = 6;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 7, 6);
  }
}
