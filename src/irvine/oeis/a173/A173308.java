package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173308 a(n) = 17*n*(n+1).
 * @author Sean A. Irvine
 */
public class A173308 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173308() {
    super(new long[] {1, -3, 3}, new long[] {0, 34, 102});
  }
}
