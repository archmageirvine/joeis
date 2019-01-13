package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187506.
 * @author Sean A. Irvine
 */
public class A187506 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187506() {
    super(new long[] {-1, 1, -1, 0, 0, 0, 3, -3, 3, -1, 1}, new long[] {0, 0, 1, 1, 1, 1, 2, 3, 4, 7, 9});
  }
}
