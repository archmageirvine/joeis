package irvine.oeis.a267;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A267370 Partial sums of A140091.
 * @author Sean A. Irvine
 */
public class A267370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267370() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 6, 21, 48});
  }
}
