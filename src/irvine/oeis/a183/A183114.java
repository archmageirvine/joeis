package irvine.oeis.a183;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A183114 Magnetic Tower of Hanoi, total number of moves, optimally solving the [RED ; NEUTRAL ; BLUE] pre-colored puzzle.
 * @author Sean A. Irvine
 */
public class A183114 extends LinearRecurrence {

  /** Construct the sequence. */
  public A183114() {
    super(new long[] {6, -5, -2, -2, 4}, new long[] {0, 1, 4, 11, 32});
  }
}
