package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166520.
 * @author Sean A. Irvine
 */
public class A166520 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166520() {
    super(new long[] {-1, 1, 1}, new long[] {1, 9, 6});
  }
}
