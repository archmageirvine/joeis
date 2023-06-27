package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173962 Averages of two consecutive odd cubes; a(n) = (n^3+(n+2)^3)/2.
 * @author Sean A. Irvine
 */
public class A173962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173962() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {14, 76, 234, 536});
  }
}
