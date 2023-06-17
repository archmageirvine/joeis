package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A022237 Gaussian binomial coefficients [ n,8 ] for q = 7.
 * @author Sean A. Irvine
 */
public class A022237 extends AbstractSequence {

  /** Construct the sequence. */
  public A022237() {
    super(8);
  }

  private int mN = 7;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 8, 7);
  }
}
