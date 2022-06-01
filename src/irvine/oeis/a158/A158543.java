package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158543 a(n) = 144*n^2 - 12.
 * @author Sean A. Irvine
 */
public class A158543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158543() {
    super(new long[] {1, -3, 3}, new long[] {132, 564, 1284});
  }
}
