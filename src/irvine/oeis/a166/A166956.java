package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166956 a(n) = 2^n +(-1)^n - 2.
 * @author Sean A. Irvine
 */
public class A166956 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166956() {
    super(new long[] {-2, 1, 2}, new long[] {0, -1, 3});
  }
}
