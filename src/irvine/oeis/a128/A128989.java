package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128989.
 * @author Sean A. Irvine
 */
public class A128989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128989() {
    super(new long[] {-1296, 864, -216, 24}, new long[] {0, 144, 3888, 62208});
  }
}
