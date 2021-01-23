package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106331 Numbers j such that 24*(j^2) + 25 = k^2.
 * @author Sean A. Irvine
 */
public class A106331 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106331() {
    super(new long[] {-1, 0, 0, 10, 0, 0}, new long[] {0, 1, 2, 5, 12, 21});
  }
}
