package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166639.
 * @author Sean A. Irvine
 */
public class A166639 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166639() {
    super(new long[] {-1, 1, 1}, new long[] {7, 5, 19});
  }
}
