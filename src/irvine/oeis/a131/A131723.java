package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131723 a(2*n) = 1-n^2, a(2*n+1) = n*(n+1).
 * @author Sean A. Irvine
 */
public class A131723 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131723() {
    super(new long[] {1, 2, 0, -2}, new long[] {0, 2, -3, 6});
  }
}
