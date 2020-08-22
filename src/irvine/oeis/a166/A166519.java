package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166519 a(n) = 1 + 2*(-1)^n + 2*n.
 * @author Sean A. Irvine
 */
public class A166519 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166519() {
    super(new long[] {-1, 1, 1}, new long[] {3, 1, 7});
  }
}
