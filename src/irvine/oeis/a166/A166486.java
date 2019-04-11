package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166486 Periodic sequence <code>[0,1,1,1]</code> of length 4.
 * @author Sean A. Irvine
 */
public class A166486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166486() {
    super(new long[] {1, 0, 0, 0}, new long[] {0, 1, 1, 1});
  }
}
