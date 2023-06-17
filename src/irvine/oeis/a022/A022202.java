package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A022202 Gaussian binomial coefficients [ n,11 ] for q = 3.
 * @author Sean A. Irvine
 */
public class A022202 extends AbstractSequence {

  /** Construct the sequence. */
  public A022202() {
    super(11);
  }

  private int mN = 10;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 11, 3);
  }
}
