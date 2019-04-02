package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166025 a(0) = 6, a(1) = 17, a(n+1) = a(n) + a(n-1) for n&gt;0.
 * @author Sean A. Irvine
 */
public class A166025 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166025() {
    super(new long[] {1, 1}, new long[] {6, 17});
  }
}
