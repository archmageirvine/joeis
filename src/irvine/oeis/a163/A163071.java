package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163071 a(n) = ((4+sqrt(5))*(3+sqrt(5))^n + (4-sqrt(5))*(3-sqrt(5))^n)/2.
 * @author Sean A. Irvine
 */
public class A163071 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163071() {
    super(new long[] {-4, 6}, new long[] {4, 17});
  }
}
