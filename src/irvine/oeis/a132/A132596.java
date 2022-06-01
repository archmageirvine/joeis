package irvine.oeis.a132;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A132596 X-values of solutions to the equation X*(X + 1) - 6*Y^2 = 0.
 * @author Sean A. Irvine
 */
public class A132596 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132596() {
    super(new long[] {1, -11, 11}, new long[] {0, 2, 24});
  }
}
