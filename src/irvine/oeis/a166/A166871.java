package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166871 Permutation of the integers: 3 positives, 2 negatives.
 * @author Sean A. Irvine
 */
public class A166871 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166871() {
    super(new long[] {-1, 0, 0, 0, 0, 2, 0, 0, 0, 0}, new long[] {0, 1, 2, 3, -1, -2, 4, 5, 6, -3});
  }
}
