package irvine.oeis.a378;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A378350 Continued fraction expansion of the base 9 Champernowne constant.
 * @author Sean A. Irvine
 */
public class A378350 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A378350() {
    super(0, new A378333());
  }
}
