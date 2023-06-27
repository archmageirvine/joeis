package irvine.oeis.a034;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A034182 Number of not-necessarily-symmetric n X 2 crossword puzzle grids.
 * @author Sean A. Irvine
 */
public class A034182 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034182() {
    super(1, new long[] {-1, -1, 3}, new long[] {1, 5, 15});
  }
}
