package irvine.oeis.a072;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A072113 Continued fraction expansion of Hall and Tenenbaum constant.
 * @author Sean A. Irvine
 */
public class A072113 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A072113() {
    super(0, new A072112());
  }
}
