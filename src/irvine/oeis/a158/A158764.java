package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158764 a(n) = 38*(38*n^2 - 1).
 * @author Sean A. Irvine
 */
public class A158764 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158764() {
    super(1, new long[] {1, -3, 3}, new long[] {1406, 5738, 12958});
  }
}
