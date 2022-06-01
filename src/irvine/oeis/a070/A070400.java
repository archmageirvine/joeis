package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070400 a(n) = 6^n mod 37.
 * @author Sean A. Irvine
 */
public class A070400 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070400() {
    super(new long[] {1, -1, 1}, new long[] {1, 6, 36});
  }
}
