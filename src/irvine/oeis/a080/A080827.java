package irvine.oeis.a080;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A080827 Rounded up staircase on natural numbers.
 * @author Sean A. Irvine
 */
public class A080827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080827() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 3, 5, 9});
  }
}
