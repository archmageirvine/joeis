package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185170 a(n) = floor( (2*n^2 - 6*n + 9) / 5).
 * @author Sean A. Irvine
 */
public class A185170 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185170() {
    super(new long[] {1, -2, 1, 0, 0, -1, 2}, new long[] {1, 1, 1, 1, 3, 5, 9});
  }
}
