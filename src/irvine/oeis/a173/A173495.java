package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173495 a(n) = Lucas(n) - floor(Lucas(n)/2).
 * @author Sean A. Irvine
 */
public class A173495 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173495() {
    super(new long[] {-1, -1, 1, 1, 1}, new long[] {1, 1, 2, 2, 4});
  }
}
