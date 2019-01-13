package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166544.
 * @author Sean A. Irvine
 */
public class A166544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166544() {
    super(new long[] {-1, 1, 1}, new long[] {2, 12, 9});
  }
}
