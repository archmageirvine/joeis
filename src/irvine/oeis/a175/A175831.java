package irvine.oeis.a175;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A175831 Partial sums of ceiling(n^2/12).
 * @author Sean A. Irvine
 */
public class A175831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175831() {
    super(new long[] {-1, 2, 0, -1, -1, 0, 2}, new long[] {0, 1, 2, 3, 5, 8, 11});
  }
}
