package irvine.oeis.a167;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A167573 a(n) = 20*n^2 + 3.
 * @author Sean A. Irvine
 */
public class A167573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167573() {
    super(1, new long[] {1, -3, 3}, new long[] {23, 83, 183});
  }
}
