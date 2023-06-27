package irvine.oeis.a226;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A226141 Sum of the squared parts of the partitions of n into exactly two parts.
 * @author Sean A. Irvine
 */
public class A226141 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226141() {
    super(1, new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {0, 2, 5, 18, 30, 64, 91});
  }
}
