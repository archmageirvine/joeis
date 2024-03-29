package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173344 a(n+4) = a(n+3) - 2*a(n+2) - a(n+1) - a(n), starting with (0, 1, 0, -2).
 * @author Sean A. Irvine
 */
public class A173344 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173344() {
    super(new long[] {-1, -1, -2, 1}, new long[] {0, 1, 0, -2});
  }
}
