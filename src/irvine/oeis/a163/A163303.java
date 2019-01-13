package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163303.
 * @author Sean A. Irvine
 */
public class A163303 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163303() {
    super(new long[] {-1, 4, -6, 4}, new long[] {67, 142, 369, 754});
  }
}
