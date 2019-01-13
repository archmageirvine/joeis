package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137495.
 * @author Sean A. Irvine
 */
public class A137495 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137495() {
    super(new long[] {1, -1, 2}, new long[] {2, 3, 4});
  }
}
