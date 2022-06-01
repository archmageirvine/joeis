package irvine.oeis.a137;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A137166 Sequence equals its 4th differences shifted by one index.
 * @author Sean A. Irvine
 */
public class A137166 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137166() {
    super(new long[] {-1, 5, -6, 4}, new long[] {1, 3, 7, 15});
  }
}
