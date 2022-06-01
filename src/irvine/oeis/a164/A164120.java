package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164120 Partial sums of A162396.
 * @author Sean A. Irvine
 */
public class A164120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164120() {
    super(new long[] {-2, 2, 1}, new long[] {5, 7, 17});
  }
}
