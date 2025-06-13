package irvine.oeis.a077;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A077772 Continued fraction expansion of the ternary Champernowne constant.
 * @author Sean A. Irvine
 */
public class A077772 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A077772() {
    super(0, new A077771());
  }
}

