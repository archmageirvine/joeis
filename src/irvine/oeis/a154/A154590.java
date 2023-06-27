package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154590 a(n) = 2*n^2 + 16*n + 6.
 * @author Sean A. Irvine
 */
public class A154590 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154590() {
    super(1, new long[] {1, -3, 3}, new long[] {24, 46, 72});
  }
}
