package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152457 Partial sums of A027444.
 * @author Sean A. Irvine
 */
public class A152457 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152457() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 3, 17, 56, 140});
  }
}
