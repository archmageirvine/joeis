package irvine.oeis.a033;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A033151 Continued fraction for Niven's constant.
 * @author Sean A. Irvine
 */
public class A033151 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A033151() {
    super(new A033150());
  }
}
