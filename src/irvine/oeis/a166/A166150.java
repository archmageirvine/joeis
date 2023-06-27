package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166150 a(n) = 5*n^2 + 5*n - 9.
 * @author Sean A. Irvine
 */
public class A166150 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166150() {
    super(1, new long[] {1, -3, 3}, new long[] {1, 21, 51});
  }
}
