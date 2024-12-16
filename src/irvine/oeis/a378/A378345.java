package irvine.oeis.a378;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A378345 Continued fraction expansion of the base 4 Champernowne constant.
 * @author Sean A. Irvine
 */
public class A378345 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A378345() {
    super(0, new A378328());
  }
}
