package irvine.oeis.a141;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A141530 a(n) = 4*n^3 - 6*n^2 + 1.
 * @author Sean A. Irvine
 */
public class A141530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141530() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, -1, 9, 55});
  }
}
