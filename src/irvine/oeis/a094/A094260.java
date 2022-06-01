package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094260 Sum of next n numbers/n if n divides the sum else n times the sum of next n numbers.
 * @author Sean A. Irvine
 */
public class A094260 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094260() {
    super(new long[] {1, 0, -5, 0, 10, 0, -10, 0, 5, 0}, new long[] {1, 10, 5, 136, 13, 666, 25, 2080, 41, 5050});
  }
}
