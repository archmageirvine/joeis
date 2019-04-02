package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137501 The even numbers repeated, with alternating signs.
 * @author Sean A. Irvine
 */
public class A137501 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137501() {
    super(new long[] {1, 1, -1}, new long[] {0, 0, 2});
  }
}
