package irvine.oeis.a036;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A036790 Continued fraction for Integral_{x=0..Pi} sin(x)/x.
 * @author Sean A. Irvine
 */
public class A036790 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A036790() {
    super(0, new A036792());
  }
}
