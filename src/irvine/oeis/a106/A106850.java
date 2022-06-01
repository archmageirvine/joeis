package irvine.oeis.a106;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A106850 4 X 4 vector Markov sequence with characteristic polynomial: x^4-10*x^3+25*x^2-9.
 * @author Sean A. Irvine
 */
public class A106850 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106850() {
    super(new long[] {9, 0, -25, 10}, new long[] {0, 6, 33, 174});
  }
}
