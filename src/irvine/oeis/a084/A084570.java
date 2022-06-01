package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084570 Partial sums of A084263.
 * @author Sean A. Irvine
 */
public class A084570 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084570() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {1, 2, 6, 12, 23});
  }
}
