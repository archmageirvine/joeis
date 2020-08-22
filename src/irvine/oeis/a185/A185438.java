package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185438 a(n) = 8*n^2 - 2*n + 1.
 * @author Sean A. Irvine
 */
public class A185438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185438() {
    super(new long[] {1, -3, 3}, new long[] {1, 7, 29});
  }
}
