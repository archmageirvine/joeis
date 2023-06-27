package irvine.oeis.a255;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A255876 a(n) = (4*n^2 + 4*n - 3 - 3*(-1)^n)/2.
 * @author Sean A. Irvine
 */
public class A255876 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255876() {
    super(1, new long[] {1, -2, 0, 2}, new long[] {4, 9, 24, 37});
  }
}
