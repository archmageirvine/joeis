package irvine.oeis.a205;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A205184 Period 12: repeat (1, 8, 4, 9, 7, 8, 7, 9, 4, 8, 1, 9).
 * @author Sean A. Irvine
 */
public class A205184 extends LinearRecurrence {

  /** Construct the sequence. */
  public A205184() {
    super(1, new long[] {1, 0, -1, 0, 0, 0, 1, 0}, new long[] {1, 8, 4, 9, 7, 8, 7, 9});
  }
}
