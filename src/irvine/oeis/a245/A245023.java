package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245023 Number of cases of tie <code>(no winner)</code> in the <code>n-person rock-paper-scissors</code> game.
 * @author Sean A. Irvine
 */
public class A245023 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245023() {
    super(new long[] {6, -11, 6}, new long[] {3, 3, 9});
  }
}
