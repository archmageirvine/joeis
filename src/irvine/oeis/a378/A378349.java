package irvine.oeis.a378;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A378349 Continued fraction expansion of the base 8 Champernowne constant.
 * @author Sean A. Irvine
 */
public class A378349 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A378349() {
    super(0, new A378332());
  }
}
