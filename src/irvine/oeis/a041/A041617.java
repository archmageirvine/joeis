package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041617.
 * @author Sean A. Irvine
 */
public class A041617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041617() {
    super(new long[] {-1, 0, 434, 0}, new long[] {1, 12, 433, 5208});
  }
}
