package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166147 a(n) = 4*n^2 + 4*n - 7.
 * @author Sean A. Irvine
 */
public class A166147 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166147() {
    super(new long[] {1, -3, 3}, new long[] {1, 17, 41});
  }
}
