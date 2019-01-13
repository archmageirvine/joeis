package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173690.
 * @author Sean A. Irvine
 */
public class A173690 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173690() {
    super(new long[] {-1, 3, -3, 1, 0, 1, -3, 3}, new long[] {0, 0, 1, 3, 6, 11, 18, 28});
  }
}
