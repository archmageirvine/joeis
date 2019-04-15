package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027005 <code>a(n) = T(2*n+1,n+2),</code> T given by A026998.
 * @author Sean A. Irvine
 */
public class A027005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027005() {
    super(new long[] {1, -6, 13, -13, 6}, new long[] {1, 19, 101, 370, 1148});
  }
}
