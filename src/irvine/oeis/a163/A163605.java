package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163605.
 * @author Sean A. Irvine
 */
public class A163605 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163605() {
    super(new long[] {-23, 10}, new long[] {3, 19});
  }
}
