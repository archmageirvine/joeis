package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A022193 Gaussian binomial coefficients [ n, 10 ] for q = 2.
 * @author Sean A. Irvine
 */
public class A022193 extends AbstractSequence {

  /* Construct the sequence. */
  public A022193() {
    super(10);
  }

  private int mN = 9;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 10, 2);
  }
}
