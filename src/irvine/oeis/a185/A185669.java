package irvine.oeis.a185;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A185669 a(n) = 4*n^2 + 3*n + 2.
 * @author Sean A. Irvine
 */
public class A185669 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185669() {
    super(new long[] {1, -3, 3}, new long[] {2, 9, 24});
  }
}
