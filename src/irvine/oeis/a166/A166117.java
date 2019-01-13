package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166117.
 * @author Sean A. Irvine
 */
public class A166117 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166117() {
    super(new long[] {1, -2, 1}, new long[] {0, 1, 2});
  }
}
