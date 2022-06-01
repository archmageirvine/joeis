package irvine.oeis.a278;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A278125 a(n) = 225*2^n - 235.
 * @author Sean A. Irvine
 */
public class A278125 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278125() {
    super(new long[] {-2, 3}, new long[] {-10, 215});
  }
}
