package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111587 a(n) = 2*a(n-1) + 2*a(n-3) + a(n-4), a(0) = 1, a(1) = 4, a(2) = 9, a(3) = 20.
 * @author Sean A. Irvine
 */
public class A111587 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111587() {
    super(new long[] {1, 2, 0, 2}, new long[] {1, 4, 9, 20});
  }
}
