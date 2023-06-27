package irvine.oeis.a247;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A247060 Dynamic Betting Game D(n,4,1).
 * @author Sean A. Irvine
 */
public class A247060 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247060() {
    super(1, new long[] {-1, 1, 0, 0, 0, 1}, new long[] {1, 5, 8, 12, 16, 17});
  }
}
