package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122581 a(n) = a(n - 1) - 2*a(n - 2) + a(n - 3) - 4*a(n - 4) + 2*a(n - 5).
 * @author Sean A. Irvine
 */
public class A122581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122581() {
    super(1, new long[] {2, -4, 1, -2, 1}, new long[] {1, 1, 1, 1, 1});
  }
}
