package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070406 a(n) = 7^n mod 15.
 * @author Sean A. Irvine
 */
public class A070406 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070406() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 7, 4, 13});
  }
}
