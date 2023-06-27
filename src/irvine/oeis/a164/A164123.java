package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164123 Partial sums of A162436.
 * @author Sean A. Irvine
 */
public class A164123 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164123() {
    super(1, new long[] {-3, 3, 1}, new long[] {1, 4, 7});
  }
}
