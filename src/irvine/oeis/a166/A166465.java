package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166465.
 * @author Sean A. Irvine
 */
public class A166465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166465() {
    super(new long[] {3, 0}, new long[] {1, 5});
  }
}
