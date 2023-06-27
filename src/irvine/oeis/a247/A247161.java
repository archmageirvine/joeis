package irvine.oeis.a247;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A247161 Dynamic Betting Game D(n,4,2).
 * @author Sean A. Irvine
 */
public class A247161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247161() {
    super(1, new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 4, 5, 6, 8, 9, 11, 12, 13, 16, 17});
  }
}
