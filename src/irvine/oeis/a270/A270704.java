package irvine.oeis.a270;

import irvine.oeis.LinearRecurrence;

/**
 * A270704 Even <code>14-gonal</code> (or tetradecagonal) numbers.
 * @author Sean A. Irvine
 */
public class A270704 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270704() {
    super(new long[] {1, -3, 3}, new long[] {0, 14, 76});
  }
}
