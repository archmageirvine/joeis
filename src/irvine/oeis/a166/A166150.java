package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166150.
 * @author Sean A. Irvine
 */
public class A166150 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166150() {
    super(new long[] {1, -3, 3}, new long[] {1, 21, 51});
  }
}
