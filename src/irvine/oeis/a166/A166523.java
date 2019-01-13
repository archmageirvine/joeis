package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166523.
 * @author Sean A. Irvine
 */
public class A166523 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166523() {
    super(new long[] {-1, 1, 1}, new long[] {1, 15, 9});
  }
}
