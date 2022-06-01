package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077289 Triangular numbers that are 1/6 of another triangular number.
 * @author Sean A. Irvine
 */
public class A077289 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077289() {
    super(new long[] {1, -1, -98, 98, 1}, new long[] {0, 1, 6, 105, 595});
  }
}
