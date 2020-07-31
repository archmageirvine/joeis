package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166336 Expansion of <code>(1 - 4*x + 7*x^2 - 4*x^3 + x^4)/(1 - 7*x + 17*x^2 - 17*x^3 + 7*x^4 - x^5)</code>.
 * @author Sean A. Irvine
 */
public class A166336 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166336() {
    super(new long[] {1, -7, 17, -17, 7}, new long[] {1, 3, 11, 39, 131});
  }
}
