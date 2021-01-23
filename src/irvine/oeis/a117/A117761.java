package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117761 a(n) = a(n-1) + a(n-3) + a(n-5) + a(n-7) for n &gt;= 7.
 * @author Sean A. Irvine
 */
public class A117761 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117761() {
    super(new long[] {1, 0, 1, 0, 1, 0, 1}, new long[] {0, 1, 1, 2, 3, 5, 8});
  }
}
