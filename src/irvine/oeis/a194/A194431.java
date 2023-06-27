package irvine.oeis.a194;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A194431 a(n) = 8*n^2 - 6*n - 1.
 * @author Sean A. Irvine
 */
public class A194431 extends LinearRecurrence {

  /** Construct the sequence. */
  public A194431() {
    super(1, new long[] {1, -3, 3}, new long[] {1, 19, 53});
  }
}
