package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A022211 Gaussian binomial coefficients [ n, 12 ] for q = 4.
 * @author Sean A. Irvine
 */
public class A022211 extends AbstractSequence {

  /** Construct the sequence. */
  public A022211() {
    super(12);
  }

  private int mN = 11;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 12, 4);
  }
}
