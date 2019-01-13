package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220838.
 * @author Sean A. Irvine
 */
public class A220838 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220838() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, 0, -1, 2}, new long[] {-1, 0, 0, 0, 1, 1, 2, 3, 3, 5});
  }
}
