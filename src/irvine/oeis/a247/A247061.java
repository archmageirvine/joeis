package irvine.oeis.a247;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A247061 Dynamic Betting Game D(n,5,1).
 * @author Sean A. Irvine
 */
public class A247061 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247061() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {1, 8, 16, 17});
  }
}
