package irvine.oeis.a163;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A163605 a(n) = ((3+2*sqrt(2))*(5+sqrt(2))^n + (3-2*sqrt(2))*(5-sqrt(2))^n)/2.
 * @author Sean A. Irvine
 */
public class A163605 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163605() {
    super(new long[] {-23, 10}, new long[] {3, 19});
  }
}
