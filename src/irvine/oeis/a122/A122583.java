package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122583 a(n) = a(n - 1) - 2*a(n - 2) + a(n - 3) + 3*(-2*a(n - 4) + a(n - 5)).
 * @author Sean A. Irvine
 */
public class A122583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122583() {
    super(new long[] {3, -6, 1, -2, 1}, new long[] {1, 1, 1, 1, 1});
  }
}
