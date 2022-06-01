package irvine.oeis.a187;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A187601 n/2 times period 6 sequence [1, 2, 3, 4, 3, 2, ...].
 * @author Sean A. Irvine
 */
public class A187601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187601() {
    super(new long[] {-1, 2, -1, -2, 4, -2, -1, 2}, new long[] {0, 1, 3, 6, 6, 5, 3, 7});
  }
}
