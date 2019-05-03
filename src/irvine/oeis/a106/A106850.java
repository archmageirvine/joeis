package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106850 <code>4 X 4</code> vector Markov sequence with characteristic polynomial: <code>x^4-10*x^3+25*x^2-9</code>.
 * @author Sean A. Irvine
 */
public class A106850 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106850() {
    super(new long[] {9, 0, -25, 10}, new long[] {0, 6, 33, 174});
  }
}
