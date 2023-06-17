package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A022216 Gaussian binomial coefficients [ n,9 ] for q = 5.
 * @author Sean A. Irvine
 */
public class A022216 extends AbstractSequence {

  /** Construct the sequence. */
  public A022216() {
    super(9);
  }

  private int mN = 8;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 9, 5);
  }
}
