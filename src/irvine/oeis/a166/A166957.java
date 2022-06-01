package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166957 a(n) = 841*n^3 + 261*n^2 + 28*n + 1.
 * @author Sean A. Irvine
 */
public class A166957 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166957() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 1131, 7829, 25141});
  }
}
