package irvine.oeis.a194;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A194272 Array T(n,k) with 6 columns read by rows in which row n lists 3*n-2, 3*n-1, 3*n, 3*n, 3*n, 3*n.
 * @author Sean A. Irvine
 */
public class A194272 extends LinearRecurrence {

  /** Construct the sequence. */
  public A194272() {
    super(1, new long[] {-1, 2, -1, -1, 2}, new long[] {1, 2, 3, 3, 3});
  }
}
