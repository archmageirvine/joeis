package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166978.
 * @author Sean A. Irvine
 */
public class A166978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166978() {
    super(new long[] {-2, 1, 2}, new long[] {-1, 6, -4});
  }
}
