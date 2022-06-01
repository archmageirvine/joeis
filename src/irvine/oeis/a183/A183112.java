package irvine.oeis.a183;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A183112 Magnetic Tower of Hanoi, total number of moves, optimally solving the [RED ; BLUE ; NEUTRAL] or [NEUTRAL ; RED ; BLUE] pre-colored puzzle.
 * @author Sean A. Irvine
 */
public class A183112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A183112() {
    super(new long[] {6, -5, -2, -2, 4}, new long[] {0, 1, 4, 13, 38});
  }
}
