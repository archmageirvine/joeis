package irvine.oeis.a073;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A073031 Number of ways of making change for n cents using coins of sizes 1, 2, 5, 10 cents, when order matters.
 * @author Sean A. Irvine
 */
public class A073031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073031() {
    super(new long[] {1, 0, 0, 0, 0, 1, 0, 0, 1, 1}, new long[] {1, 1, 2, 3, 5, 9, 15, 26, 44, 75});
  }
}
