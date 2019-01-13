package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166521.
 * @author Sean A. Irvine
 */
public class A166521 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166521() {
    super(new long[] {-1, 1, 1}, new long[] {1, 11, 7});
  }
}
