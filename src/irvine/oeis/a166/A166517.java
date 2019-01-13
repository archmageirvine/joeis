package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166517.
 * @author Sean A. Irvine
 */
public class A166517 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166517() {
    super(new long[] {-1, 1, 1}, new long[] {2, 1, 5});
  }
}
