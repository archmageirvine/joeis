package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158764 38*(38*n^2-1).
 * @author Sean A. Irvine
 */
public class A158764 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158764() {
    super(new long[] {1, -3, 3}, new long[] {1406, 5738, 12958});
  }
}
