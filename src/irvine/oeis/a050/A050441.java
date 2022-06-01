package irvine.oeis.a050;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A050441 Partial sums of A051865.
 * @author Sean A. Irvine
 */
public class A050441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050441() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 14, 50});
  }
}
