package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005178 Number of domino tilings of 4 X (n-1) board.
 * @author Sean A. Irvine
 */
public class A005178 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005178() {
    super(new long[] {-1, 1, 5, 1}, new long[] {0, 1, 1, 5});
  }
}

