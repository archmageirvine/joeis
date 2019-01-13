package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163827.
 * @author Sean A. Irvine
 */
public class A163827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163827() {
    super(new long[] {-1, 4, -6, 4}, new long[] {7, 49, 163, 385});
  }
}
