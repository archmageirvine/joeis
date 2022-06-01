package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028399 a(n) = 2^n - 4.
 * @author Sean A. Irvine
 */
public class A028399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028399() {
    super(new long[] {-2, 3}, new long[] {0, 4});
  }
}
