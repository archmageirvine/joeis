package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166522 a(n) = 7*n - a(n-1), with a(1) = 1.
 * @author Sean A. Irvine
 */
public class A166522 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166522() {
    super(new long[] {-1, 1, 1}, new long[] {1, 13, 8});
  }
}
