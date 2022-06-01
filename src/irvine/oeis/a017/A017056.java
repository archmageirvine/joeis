package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017056 a(n) = (7*n + 6)^4.
 * @author Sean A. Irvine
 */
public class A017056 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017056() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1296, 28561, 160000, 531441, 1336336});
  }
}
