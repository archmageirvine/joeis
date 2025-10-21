package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173809 a(2*n+1) = 1+A131941(2*n+1). a(2*n) = A131941(2*n).
 * @author Sean A. Irvine
 */
public class A173809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173809() {
    super(1, new long[] {-1, 3, -2, -2, 3}, new long[] {2, 3, 9, 16, 30});
  }
}
