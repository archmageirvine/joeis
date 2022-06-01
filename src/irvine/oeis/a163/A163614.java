package irvine.oeis.a163;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A163614 a(n) = ((1 + 3*sqrt(2))*(3 + sqrt(2))^n + (1 - 3*sqrt(2))*(3 - sqrt(2))^n)/2.
 * @author Sean A. Irvine
 */
public class A163614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163614() {
    super(new long[] {-7, 6}, new long[] {1, 9});
  }
}
