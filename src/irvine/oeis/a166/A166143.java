package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166143 a(n) = 3n^2 + 3n - 5.
 * @author Sean A. Irvine
 */
public class A166143 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166143() {
    super(new long[] {1, -3, 3}, new long[] {1, 13, 31});
  }
}
