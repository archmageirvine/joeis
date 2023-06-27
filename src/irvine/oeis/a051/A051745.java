package irvine.oeis.a051;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A051745 a(n) = n*(n^4 + 10*n^3 + 35*n^2 + 50*n + 144)/120.
 * @author Sean A. Irvine
 */
public class A051745 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051745() {
    super(1, new long[] {-1, 6, -15, 20, -15, 6}, new long[] {2, 8, 24, 60, 131, 258});
  }
}
