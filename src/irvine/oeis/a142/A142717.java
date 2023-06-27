package irvine.oeis.a142;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A142717 First (leftmost) odd term in the n-th row of triangle A120070.
 * @author Sean A. Irvine
 */
public class A142717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A142717() {
    super(1, new long[] {1, -2, 0, 2}, new long[] {3, 5, 15, 21});
  }
}
