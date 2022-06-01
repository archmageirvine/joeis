package irvine.oeis.a126;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A126276 Moment of inertia of all magic cubes of order n.
 * @author Sean A. Irvine
 */
public class A126276 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126276() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {18, 504, 5200, 31500, 136710, 471968, 1378944, 3547800, 8258250});
  }
}
