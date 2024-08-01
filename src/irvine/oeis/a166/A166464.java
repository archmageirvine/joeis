package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166464 a(n) = (3 + 2*n + 6*n^2 + 4*n^3)/3.
 * @author Sean A. Irvine
 */
public class A166464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166464() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 5, 21, 57});
  }
}
