package irvine.oeis.a080;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A080335 Diagonal in square spiral or maze arrangement of natural numbers.
 * @author Sean A. Irvine
 */
public class A080335 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080335() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 5, 9, 17});
  }
}
