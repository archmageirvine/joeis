package irvine.oeis.a267;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A267615 a(n) = 2^n + 11.
 * @author Sean A. Irvine
 */
public class A267615 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267615() {
    super(new long[] {-2, 3}, new long[] {12, 13});
  }
}
