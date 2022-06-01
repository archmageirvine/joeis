package irvine.oeis.a188;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A188947 a(n) = n^3 - 2*n^2 + 2*n + 1.
 * @author Sean A. Irvine
 */
public class A188947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188947() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 5, 16, 41});
  }
}
