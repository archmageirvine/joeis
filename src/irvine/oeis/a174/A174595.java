package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174595 <code>a(n) = 5*n^2/8 - n + 1/2 + (-1)^n*(-3*n^2/8 + n - 1/2)</code>.
 * @author Sean A. Irvine
 */
public class A174595 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174595() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {0, 0, 1, 4, 4, 16});
  }
}
