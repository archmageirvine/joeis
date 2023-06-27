package irvine.oeis.a054;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A054401 5^n-4^n-1.
 * @author Sean A. Irvine
 */
public class A054401 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054401() {
    super(1, new long[] {20, -29, 10}, new long[] {0, 8, 60});
  }
}
