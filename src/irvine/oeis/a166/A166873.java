package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166873.
 * @author Sean A. Irvine
 */
public class A166873 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166873() {
    super(new long[] {1, -3, 3}, new long[] {1, 25, 61});
  }
}
