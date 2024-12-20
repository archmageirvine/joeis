package irvine.oeis.a378;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A378346 Continued fraction expansion of the base 5 Champernowne constant.
 * @author Sean A. Irvine
 */
public class A378346 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A378346() {
    super(0, new A378329(), 5000);
  }
}
