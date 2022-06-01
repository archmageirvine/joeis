package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173307 a(n) = 13*n*(n+1).
 * @author Sean A. Irvine
 */
public class A173307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173307() {
    super(new long[] {1, -3, 3}, new long[] {0, 26, 78});
  }
}
