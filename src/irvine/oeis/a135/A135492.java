package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135492 Number of ways to toss a coin n times and not get a run of five.
 * @author Sean A. Irvine
 */
public class A135492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135492() {
    super(0, new long[] {1, 1, 1, 1}, new long[] {2, 4, 8, 16}, 1);
  }
}
