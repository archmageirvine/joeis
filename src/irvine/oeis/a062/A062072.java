package irvine.oeis.a062;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A062072 Continued fraction expansion of Fibonacci factorial constant.
 * @author Sean A. Irvine
 */
public class A062072 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A062072() {
    super(0, new A062073());
  }
}
