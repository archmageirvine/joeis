package irvine.oeis.a247;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A247062 Dynamic Betting Game D(n,5,2).
 * @author Sean A. Irvine
 */
public class A247062 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247062() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 5, 6, 8, 11, 12, 16, 17});
  }
}
