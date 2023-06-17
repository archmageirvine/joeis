package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A022227 Gaussian binomial coefficients [ n,9 ] for q = 6.
 * @author Sean A. Irvine
 */
public class A022227 extends AbstractSequence {

  /** Construct the sequence. */
  public A022227() {
    super(9);
  }

  private int mN = 8;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 9, 6);
  }
}
