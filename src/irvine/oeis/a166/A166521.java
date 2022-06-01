package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166521 a(n) = (6*n + 7*(-1)^n + 3)/2.
 * @author Sean A. Irvine
 */
public class A166521 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166521() {
    super(new long[] {-1, 1, 1}, new long[] {1, 11, 7});
  }
}
