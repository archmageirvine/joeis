package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134154 a(n) = 15*n^2 - 9*n + 1.
 * @author Sean A. Irvine
 */
public class A134154 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134154() {
    super(new long[] {1, -3, 3}, new long[] {1, 7, 43});
  }
}
