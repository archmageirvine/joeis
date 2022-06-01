package irvine.oeis.a215;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A215502 a(n) = (1+sqrt(3))^n + (-2)^n + (1-sqrt(3))^n + 1.
 * @author Sean A. Irvine
 */
public class A215502 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215502() {
    super(new long[] {-4, -2, 6, 1}, new long[] {4, 1, 13, 13});
  }
}
