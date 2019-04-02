package irvine.oeis.a204;

import irvine.oeis.LinearRecurrence;

/**
 * A204090 The number of 1 X n Haunted Mirror Maze puzzles with a unique solution where mirror orientation is fixed.
 * @author Sean A. Irvine
 */
public class A204090 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204090() {
    super(new long[] {-4, 14, -16, 7}, new long[] {1, 2, 8, 34});
  }
}
