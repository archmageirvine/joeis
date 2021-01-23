package irvine.oeis.a036;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A036791 Continued fraction for (2/Pi)*Integral_{x=0..Pi} sin(x)/x.
 * @author Sean A. Irvine
 */
public class A036791 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A036791() {
    super(new A036793());
  }
}
