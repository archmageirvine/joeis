package irvine.oeis.a183;

import irvine.oeis.LinearRecurrence;

/**
 * A183119 Magnetic Tower of Hanoi, total number of moves generated by a certain algorithm, yielding a "forward moving" non-optimal solution of the [RED ; NEUTRAL ; <code>BLUE] pre-colored</code> puzzle.
 * @author Sean A. Irvine
 */
public class A183119 extends LinearRecurrence {

  /** Construct the sequence. */
  public A183119() {
    super(new long[] {3, -4, -2, 4}, new long[] {0, 1, 4, 11});
  }
}
