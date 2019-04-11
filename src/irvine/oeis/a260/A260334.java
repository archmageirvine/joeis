package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260334 <code>a(n) = (36*n^6 - 60*n^5 + 30*n^4 + 4*n^3 + 8*n^2 - 4*n + 1 - (-1)^n)/8</code>.
 * @author Sean A. Irvine
 */
public class A260334 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260334() {
    super(new long[] {1, -6, 14, -14, 0, 14, -14, 6}, new long[] {0, 2, 115, 1783, 11758, 49304, 156633, 412589});
  }
}
