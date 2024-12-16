package irvine.oeis.a378;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A378347 Continued fraction expansion of the base 6 Champernowne constant.
 * @author Sean A. Irvine
 */
public class A378347 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A378347() {
    super(0, new A378330());
  }
}
