package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157660 a(n) = 8000*n - 40.
 * @author Sean A. Irvine
 */
public class A157660 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157660() {
    super(1, new long[] {-1, 2}, new long[] {7960, 15960});
  }
}
