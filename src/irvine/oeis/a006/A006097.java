package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A006097 Gaussian binomial coefficient [ n, 4 ] for q=2.
 * @author Sean A. Irvine
 */
public class A006097 extends AbstractSequence {

  /** Construct the sequence. */
  public A006097() {
    super(4);
  }

  private int mN = 3;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 4, 2);
  }
}
