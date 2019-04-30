package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133673 <code>a(n) = n*L(n) + (n-1)*L(n-1)</code> where <code>L(n)</code> is the Lucas number.
 * @author Sean A. Irvine
 */
public class A133673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133673() {
    super(new long[] {-1, -2, 1, 2}, new long[] {7, 18, 40, 83});
  }
}
