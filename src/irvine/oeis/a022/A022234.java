package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A022234 Gaussian binomial coefficients [ n,5 ] for q = 7.
 * @author Sean A. Irvine
 */
public class A022234 extends AbstractSequence {

  /** Construct the sequence. */
  public A022234() {
    super(5);
  }

  private int mN = 4;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 5, 7);
  }
}
