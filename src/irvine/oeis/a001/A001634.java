package irvine.oeis.a001;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A001634 a(n) = a(n-2) + a(n-3) + a(n-4), with initial values a(0) = 0, a(1) = 2, a(2) = 3, a(3) = 6.
 * @author Sean A. Irvine
 */
public class A001634 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001634() {
    super(new long[] {1, 1, 1, 0}, new long[] {0, 2, 3, 6});
  }
}
