package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269440.
 * @author Sean A. Irvine
 */
public class A269440 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269440() {
    super(new long[] {1, 3, 2, -2, -3}, new long[] {0, -1, 9, -25, 55});
  }
}
