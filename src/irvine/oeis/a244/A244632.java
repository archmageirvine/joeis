package irvine.oeis.a244;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A244632 23*n^2.
 * @author Sean A. Irvine
 */
public class A244632 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244632() {
    super(new long[] {1, -3, 3}, new long[] {0, 23, 92});
  }
}
