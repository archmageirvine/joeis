package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153644 <code>a(n) = 4*n^2 + 28*n + 10</code>.
 * @author Sean A. Irvine
 */
public class A153644 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153644() {
    super(new long[] {1, -3, 3}, new long[] {42, 82, 130});
  }
}
