package irvine.oeis.a267;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A267808 a(0) = a(1) = 1; for n&gt;1, a(n) = (a(n-1) mod 4) + a(n-2).
 * @author Sean A. Irvine
 */
public class A267808 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267808() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {1, 1, 2, 3, 5, 4, 5});
  }
}
