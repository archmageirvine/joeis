package irvine.oeis.a378;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A378348 Continued fraction expansion of the base 7 Champernowne constant.
 * @author Sean A. Irvine
 */
public class A378348 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A378348() {
    super(0, new A378331(), 5000);
  }
}
