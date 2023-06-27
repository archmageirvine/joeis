package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152577 a(n) = 10^(2*n - 1) + 1.
 * @author Sean A. Irvine
 */
public class A152577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152577() {
    super(1, new long[] {-100, 101}, new long[] {11, 1001});
  }
}
