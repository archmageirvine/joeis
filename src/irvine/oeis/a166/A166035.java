package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166035.
 * @author Sean A. Irvine
 */
public class A166035 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166035() {
    super(new long[] {12, -1}, new long[] {1, -3});
  }
}
