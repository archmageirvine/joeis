package irvine.oeis.a076;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A076310 a(n) = floor(n/10) + 4*(n mod 10).
 * @author Sean A. Irvine
 */
public class A076310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076310() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 4, 8, 12, 16, 20, 24, 28, 32, 36, 1});
  }
}
