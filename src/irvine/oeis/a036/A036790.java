package irvine.oeis.a036;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A036790 Continued fraction for Integral_{x=0..Pi} sin(x)/x.
 * @author Sean A. Irvine
 */
public class A036790 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A036790() {
    super(new A036792());
  }
}
