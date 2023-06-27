package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158445 a(n) = 25*n^2 + 5.
 * @author Sean A. Irvine
 */
public class A158445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158445() {
    super(1, new long[] {1, -3, 3}, new long[] {30, 105, 230});
  }
}
