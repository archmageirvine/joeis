package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173809 <code>a(2n+1) = 1+A131941(2n+1). a(2n) = A131941(2n)</code>.
 * @author Sean A. Irvine
 */
public class A173809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173809() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {2, 3, 9, 16, 30});
  }
}
