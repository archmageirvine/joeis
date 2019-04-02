package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166136 a(n) = n*(n+3)/2 + 7.
 * @author Sean A. Irvine
 */
public class A166136 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166136() {
    super(new long[] {1, -3, 3}, new long[] {9, 12, 16});
  }
}
