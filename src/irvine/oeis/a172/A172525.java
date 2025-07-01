package irvine.oeis.a172;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A172525 a(n) = 111111111 * n.
 * @author Sean A. Irvine
 */
public class A172525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172525() {
    super(1, new long[] {-1, 2}, new long[] {111111111, 222222222});
  }
}
