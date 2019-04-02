package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053344 Minimal number of coins needed to pay n cents using coins of denominations 1, 5, 10, 25 cents.
 * @author Sean A. Irvine
 */
public class A053344 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053344() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 2, 3, 4, 5, 6, 2, 3, 4, 5, 6, 1, 2});
  }
}
