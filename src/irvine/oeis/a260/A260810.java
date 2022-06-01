package irvine.oeis.a260;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A260810 a(n) = n^2*(3*n^2 - 1)/2.
 * @author Sean A. Irvine
 */
public class A260810 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260810() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 22, 117, 376});
  }
}
