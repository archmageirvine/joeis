package irvine.oeis.a111;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A111721 a(n) = a(n-1) + a(n-2) + 5 where a(0) = a(1) = 1.
 * @author Sean A. Irvine
 */
public class A111721 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111721() {
    super(new long[] {-1, 0, 2}, new long[] {1, 1, 7});
  }
}
