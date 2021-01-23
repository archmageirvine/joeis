package irvine.oeis.a068;

import irvine.oeis.LinearRecurrence;

/**
 * A068921 Number of ways to tile a 2 X n room with 1x2 Tatami mats. At most 3 Tatami mats may meet at a point.
 * @author Sean A. Irvine
 */
public class A068921 extends LinearRecurrence {

  /** Construct the sequence. */
  public A068921() {
    super(new long[] {1, 0, 1}, new long[] {1, 1, 2});
  }
}
