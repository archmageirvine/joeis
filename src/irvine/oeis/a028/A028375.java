package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028375 Squares of (odd numbers not divisible by <code>5)</code>.
 * @author Sean A. Irvine
 */
public class A028375 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028375() {
    super(new long[] {1, -1, 0, 0, -2, 2, 0, 0, 1}, new long[] {1, 9, 49, 81, 121, 169, 289, 361, 441});
  }
}
