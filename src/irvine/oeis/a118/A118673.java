package irvine.oeis.a118;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A118673 Positive solutions x to the equation x^2 + (x+71)^2 = y^2.
 * @author Sean A. Irvine
 */
public class A118673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118673() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 13, 160, 213, 280, 1113, 1420});
  }
}
