package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163609 a(n) = ((5 + 2*sqrt(2))*(3 + sqrt(2))^n + (5 - 2*sqrt(2))*(3 - sqrt(2))^n)/2.
 * @author Sean A. Irvine
 */
public class A163609 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163609() {
    super(new long[] {-7, 6}, new long[] {5, 19});
  }
}
