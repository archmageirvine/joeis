package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122582 a(n) = a(n - 1) - 2*a(n - 2) + a(n - 3) - 2*a(n - 4) + a(n - 5).
 * @author Sean A. Irvine
 */
public class A122582 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122582() {
    super(1, new long[] {1, -2, 1, -2, 1}, new long[] {1, 1, 1, 1, 1});
  }
}
