package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084569 Partial sums of A084570.
 * @author Sean A. Irvine
 */
public class A084569 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084569() {
    super(new long[] {1, -4, 5, 0, -5, 4}, new long[] {1, 3, 9, 21, 44, 82});
  }
}
