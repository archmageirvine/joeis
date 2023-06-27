package irvine.oeis.a124;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A124479 From the game of Quod: number of "squares" on an n X n array of points with the four corner points deleted.
 * @author Sean A. Irvine
 */
public class A124479 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124479() {
    super(2, new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 11, 37, 88});
  }
}
