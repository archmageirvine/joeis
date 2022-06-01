package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070370 a(n) = 5^n mod 16.
 * @author Sean A. Irvine
 */
public class A070370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070370() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 5, 9, 13});
  }
}
