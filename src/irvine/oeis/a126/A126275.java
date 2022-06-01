package irvine.oeis.a126;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A126275 Moment of inertia of all magic squares of order n.
 * @author Sean A. Irvine
 */
public class A126275 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126275() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {5, 60, 340, 1300, 3885, 9800, 21840});
  }
}
