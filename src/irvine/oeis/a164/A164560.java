package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164560 Partial sums of A164532.
 * @author Sean A. Irvine
 */
public class A164560 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164560() {
    super(1, new long[] {-6, 6, 1}, new long[] {1, 5, 11});
  }
}
