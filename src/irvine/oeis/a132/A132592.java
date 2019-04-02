package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132592 X-values of solutions to the equation X*(X + 1) - 8*Y^2 = 0.
 * @author Sean A. Irvine
 */
public class A132592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132592() {
    super(new long[] {1, -35, 35}, new long[] {0, 8, 288});
  }
}
