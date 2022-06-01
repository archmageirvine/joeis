package irvine.oeis.a204;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A204092 The number of 1 by n Haunted Mirror Maze puzzles with a unique solution.
 * @author Sean A. Irvine
 */
public class A204092 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204092() {
    super(new long[] {-4, 16, -19, 8}, new long[] {1, 3, 17, 91});
  }
}
