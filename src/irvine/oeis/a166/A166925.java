package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166925 Digital root of square of n-th triangular number.
 * @author Sean A. Irvine
 */
public class A166925 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166925() {
    super(1, new long[] {1, 0, 0}, new long[] {1, 9, 9});
  }
}
