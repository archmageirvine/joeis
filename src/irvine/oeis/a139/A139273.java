package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139273 a(n) = n*(8*n - 3).
 * @author Sean A. Irvine
 */
public class A139273 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139273() {
    super(new long[] {1, -3, 3}, new long[] {0, 5, 26});
  }
}
