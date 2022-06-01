package irvine.oeis.a008;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A008503 9-dimensional centered tetrahedral numbers.
 * @author Sean A. Irvine
 */
public class A008503 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008503() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10},
      new long[] {1, 11, 66, 286, 1001, 3003, 8008, 19448, 43758, 92378});
  }
}

