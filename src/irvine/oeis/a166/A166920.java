package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166920.
 * @author Sean A. Irvine
 */
public class A166920 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166920() {
    super(new long[] {-2, 1, 2}, new long[] {0, 2, 3});
  }
}
