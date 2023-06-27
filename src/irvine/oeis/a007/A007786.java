package irvine.oeis.a007;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A007786 Number of nonintersecting rook paths joining opposite corners of 4 X n board.
 * @author Sean A. Irvine
 */
public class A007786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007786() {
    super(1, new long[] {-1, -4, 12, 40, -69, -94, 175, -16, -133, 124, -54, 12},
      new long[] {1, 8, 38, 184, 976, 5382, 29739, 163496, 896476, 4913258, 26932712, 147657866});
  }
}

