package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070372 a(n) = 5^n mod 18.
 * @author Sean A. Irvine
 */
public class A070372 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070372() {
    super(new long[] {1, -1, 0, 1}, new long[] {1, 5, 7, 17});
  }
}
