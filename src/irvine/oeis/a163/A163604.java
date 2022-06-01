package irvine.oeis.a163;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A163604 a(n) = ((3+2*sqrt(2))*(4+sqrt(2))^n + (3-2*sqrt(2))*(4-sqrt(2))^n)/2.
 * @author Sean A. Irvine
 */
public class A163604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163604() {
    super(new long[] {-14, 8}, new long[] {3, 16});
  }
}
