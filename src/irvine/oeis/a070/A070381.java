package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070381 a(n) = 5^n mod 33.
 * @author Sean A. Irvine
 */
public class A070381 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070381() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 5, 25, 26, 31, 23, 16, 14, 4, 20});
  }
}
