package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163070 a(n) = ((4+sqrt(5))*(2+sqrt(5))^n + (4-sqrt(5))*(2-sqrt(5))^n)/2.
 * @author Sean A. Irvine
 */
public class A163070 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163070() {
    super(new long[] {1, 4}, new long[] {4, 13});
  }
}
