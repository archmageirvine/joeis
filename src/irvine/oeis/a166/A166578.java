package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166578.
 * @author Sean A. Irvine
 */
public class A166578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166578() {
    super(new long[] {-2, 1, 0, 2}, new long[] {1, 2, 1, 2});
  }
}
