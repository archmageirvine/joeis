package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133673 a(n) = n*L(n) + (n-1)*L(n-1) where L(n) is the Lucas number.
 * @author Sean A. Irvine
 */
public class A133673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133673() {
    super(2, new long[] {-1, -2, 1, 2}, new long[] {7, 18, 40, 83});
  }
}
