package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248851 <code>a(n) = ( 2*n*(2*n^2 + 9*n + 14) + (-1)^n - 1 )/16</code>.
 * @author Sean A. Irvine
 */
public class A248851 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248851() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 3, 10, 22, 41});
  }
}
