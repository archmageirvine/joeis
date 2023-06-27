package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123650 a(n) = 1 + n^2 + n^3 + n^5.
 * @author Sean A. Irvine
 */
public class A123650 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123650() {
    super(1, new long[] {-1, 6, -15, 20, -15, 6}, new long[] {4, 45, 280, 1105, 3276, 8029});
  }
}
