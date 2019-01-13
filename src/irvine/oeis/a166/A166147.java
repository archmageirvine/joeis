package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166147.
 * @author Sean A. Irvine
 */
public class A166147 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166147() {
    super(new long[] {1, -3, 3}, new long[] {1, 17, 41});
  }
}
