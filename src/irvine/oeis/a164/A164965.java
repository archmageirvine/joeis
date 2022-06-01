package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164965 Cumulative sums of A010892.
 * @author Sean A. Irvine
 */
public class A164965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164965() {
    super(new long[] {1, -2, 2}, new long[] {1, 2, 2});
  }
}
