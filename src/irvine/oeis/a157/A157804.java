package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157804 a(n) = 1482401250*n^2 - 2793393900*n + 1315947601.
 * @author Sean A. Irvine
 */
public class A157804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157804() {
    super(new long[] {1, -3, 3}, new long[] {4954951, 1658764801, 6277377151L});
  }
}
