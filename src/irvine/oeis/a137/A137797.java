package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137797.
 * @author Sean A. Irvine
 */
public class A137797 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137797() {
    super(new long[] {1, 1, 0, 0, 0, -1}, new long[] {0, 4, 4, 8, -2, 2});
  }
}
