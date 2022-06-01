package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083392 Alternating partial sums of A000217.
 * @author Sean A. Irvine
 */
public class A083392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083392() {
    super(new long[] {1, 2, 0, -2}, new long[] {0, -1, 2, -4});
  }
}
