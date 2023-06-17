package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A022255 Gaussian binomial coefficients [ n,4 ] for q = 9.
 * @author Sean A. Irvine
 */
public class A022255 extends AbstractSequence {

  /** Construct the sequence. */
  public A022255() {
    super(4);
  }

  private int mN = 3;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 4, 9);
  }
}
