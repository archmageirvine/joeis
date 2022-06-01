package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153644 a(n) = 4*n^2 + 28*n + 10.
 * @author Sean A. Irvine
 */
public class A153644 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153644() {
    super(new long[] {1, -3, 3}, new long[] {42, 82, 130});
  }
}
