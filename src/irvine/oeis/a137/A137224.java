package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137224.
 * @author Sean A. Irvine
 */
public class A137224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137224() {
    super(new long[] {1, -1, -1, 1, -1, 1, 1}, new long[] {0, 1, 2, 1, 4, 5, 10});
  }
}
