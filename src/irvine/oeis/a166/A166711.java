package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166711 Permutation of the integers: two positives, one negative.
 * @author Sean A. Irvine
 */
public class A166711 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166711() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {0, 1, 2, -1, 3, 4});
  }
}
