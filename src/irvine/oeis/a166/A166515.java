package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166515.
 * @author Sean A. Irvine
 */
public class A166515 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166515() {
    super(new long[] {1, -1, -1, 1, -1, 1, 1}, new long[] {0, 1, 2, 2, 4, 5, 8});
  }
}
