package irvine.oeis.a210;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A210699 Number of bilaterally asymmetric 8-hoops with n symbols and no a-rooted trees.
 * @author Sean A. Irvine
 */
public class A210699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210699() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 71, 918, 6667, 33665, 131616, 425866, 1192178, 2977857});
  }
}
