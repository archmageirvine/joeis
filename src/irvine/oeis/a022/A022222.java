package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A022222 Gaussian binomial coefficients [ n, 4 ] for q = 6.
 * @author Sean A. Irvine
 */
public class A022222 extends AbstractSequence {

  /* Construct the sequence. */
  public A022222() {
    super(4);
  }

  private int mN = 3;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 4, 6);
  }
}
