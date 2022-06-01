package irvine.oeis.a270;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A270704 Even 14-gonal (or tetradecagonal) numbers.
 * @author Sean A. Irvine
 */
public class A270704 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270704() {
    super(new long[] {1, -3, 3}, new long[] {0, 14, 76});
  }
}
