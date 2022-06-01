package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047520 a(n) = 2*a(n-1) + n^2, a(0) = 0.
 * @author Sean A. Irvine
 */
public class A047520 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047520() {
    super(new long[] {-2, 7, -9, 5}, new long[] {0, 1, 6, 21});
  }
}
