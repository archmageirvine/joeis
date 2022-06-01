package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139614 a(n) = 91*n + 14.
 * @author Sean A. Irvine
 */
public class A139614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139614() {
    super(new long[] {-1, 2}, new long[] {14, 105});
  }
}
