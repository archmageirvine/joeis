package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158446 a(n) = 25*n^2 - 5.
 * @author Sean A. Irvine
 */
public class A158446 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158446() {
    super(1, new long[] {1, -3, 3}, new long[] {20, 95, 220});
  }
}
