package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122115 a(n) = a(n-1) + a(n-3) + a(n-5).
 * @author Sean A. Irvine
 */
public class A122115 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122115() {
    super(new long[] {1, 0, 1, 0, 1}, new long[] {-3, -1, 4, 8, 15});
  }
}
