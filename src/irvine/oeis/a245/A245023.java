package irvine.oeis.a245;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A245023 Number of cases of tie (no winner) in the n-person rock-paper-scissors game.
 * @author Sean A. Irvine
 */
public class A245023 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245023() {
    super(new long[] {6, -11, 6}, new long[] {3, 3, 9});
  }
}
