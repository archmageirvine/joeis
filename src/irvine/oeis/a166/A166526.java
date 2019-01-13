package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166526.
 * @author Sean A. Irvine
 */
public class A166526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166526() {
    super(new long[] {-1, 1, 1}, new long[] {1, 23, 13});
  }
}
