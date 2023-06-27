package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166931 Numbers n with property that n mod k is k-1 for all k = 2..9.
 * @author Sean A. Irvine
 */
public class A166931 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166931() {
    super(1, new long[] {-1, 2}, new long[] {2519, 5039});
  }
}
