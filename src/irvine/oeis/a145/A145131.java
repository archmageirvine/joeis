package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145131.
 * @author Sean A. Irvine
 */
public class A145131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145131() {
    super(new long[] {1, -2, 1, 1, -3, 3}, new long[] {0, 1, 3, 6, 10, 16});
  }
}
