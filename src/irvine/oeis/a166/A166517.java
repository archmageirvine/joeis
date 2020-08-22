package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166517 a(n) = (3 + 5*(-1)^n + 6*n)/4.
 * @author Sean A. Irvine
 */
public class A166517 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166517() {
    super(new long[] {-1, 1, 1}, new long[] {2, 1, 5});
  }
}
