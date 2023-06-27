package irvine.oeis.a241;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A241217 Largest number that when multiplied by 7 produces an n-digit number.
 * @author Sean A. Irvine
 */
public class A241217 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241217() {
    super(1, new long[] {-10, 11, -1, -10, 11}, new long[] {1, 14, 142, 1428, 14285});
  }
}
