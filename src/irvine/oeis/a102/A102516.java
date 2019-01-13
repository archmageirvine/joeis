package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102516.
 * @author Sean A. Irvine
 */
public class A102516 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102516() {
    super(new long[] {1, 0, 0, 1, -3, 3}, new long[] {0, 1, 2, 3, 4, 5});
  }
}
