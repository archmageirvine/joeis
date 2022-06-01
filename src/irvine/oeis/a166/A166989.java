package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166989 G.f.: A(x) = 1/(1 - 2*x - 7*x^2 - 2*x^3 + x^4).
 * @author Sean A. Irvine
 */
public class A166989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166989() {
    super(new long[] {-1, 2, 7, 2}, new long[] {1, 2, 11, 38});
  }
}
