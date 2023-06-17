package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A022248 Gaussian binomial coefficients [ n, 8 ] for q = 8.
 * @author Sean A. Irvine
 */
public class A022248 extends AbstractSequence {

  /* Construct the sequence. */
  public A022248() {
    super(8);
  }

  private int mN = 7;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 8, 8);
  }
}
