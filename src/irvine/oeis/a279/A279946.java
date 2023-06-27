package irvine.oeis.a279;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A279946 Numbers that are both dodecagonal and centered heptagonal.
 * @author Sean A. Irvine
 */
public class A279946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279946() {
    super(1, new long[] {1, -1, -252002, 252002, 1}, new long[] {1, 10396, 326656, 2619897841L, 82318050361L});
  }
}
