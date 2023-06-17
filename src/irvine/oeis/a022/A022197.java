package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A022197 Gaussian binomial coefficients [ n,6 ] for q = 3.
 * @author Sean A. Irvine
 */
public class A022197 extends AbstractSequence {

  /** Construct the sequence. */
  public A022197() {
    super(6);
  }

  private int mN = 5;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 6, 3);
  }
}
