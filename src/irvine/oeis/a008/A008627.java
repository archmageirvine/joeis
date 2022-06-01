package irvine.oeis.a008;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A008627 Molien series for A_4.
 * @author Sean A. Irvine
 */
public class A008627 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008627() {
    super(new long[] {-1, 1, 2, -1, -2, -1, 2, 1},
      new long[] {1, 1, 2, 3, 5, 6, 10, 12});
  }
}

