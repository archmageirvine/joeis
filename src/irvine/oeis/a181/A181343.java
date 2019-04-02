package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181343 a(n) = (35*n^4 - 35*n^3 + 55*n^2 - 25*n + 6)/6.
 * @author Sean A. Irvine
 */
public class A181343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181343() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {6, 76, 386, 1251, 3126});
  }
}
