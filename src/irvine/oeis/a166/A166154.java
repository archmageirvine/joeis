package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166154 a(n) = 7*n*(n+1)/2 - 5.
 * @author Sean A. Irvine
 */
public class A166154 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166154() {
    super(1, new long[] {1, -3, 3}, new long[] {2, 16, 37});
  }
}
