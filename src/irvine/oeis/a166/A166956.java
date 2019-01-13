package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166956.
 * @author Sean A. Irvine
 */
public class A166956 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166956() {
    super(new long[] {-2, 1, 2}, new long[] {0, -1, 3});
  }
}
