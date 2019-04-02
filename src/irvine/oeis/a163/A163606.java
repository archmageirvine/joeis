package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163606 a(n) = ((3 + 2*sqrt(2))*(3 + sqrt(2))^n + (3 - 2*sqrt(2))*(3 - sqrt(2))^n)/2.
 * @author Sean A. Irvine
 */
public class A163606 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163606() {
    super(new long[] {-7, 6}, new long[] {3, 13});
  }
}
