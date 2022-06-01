package irvine.oeis.a178;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A178441 INVERT transform of A058187, the tetrahedral numbers with repeats.
 * @author Sean A. Irvine
 */
public class A178441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178441() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 2}, new long[] {1, 2, 7, 17, 46, 119, 311});
  }
}
