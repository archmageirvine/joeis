package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185950 a(n) = 4*n^2 - n - 1.
 * @author Sean A. Irvine
 */
public class A185950 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185950() {
    super(new long[] {1, -3, 3}, new long[] {-1, 2, 13});
  }
}
