package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166593 Partial sums of A166592.
 * @author Sean A. Irvine
 */
public class A166593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166593() {
    super(new long[] {1, -1, -1, 1, 1}, new long[] {0, 1, 4, 6, 9});
  }
}
