package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094434 a(n) = rightmost term of M^n * [1 0 0], with M = the 3 X 3 matrix [1 -1 0 / -1 3 -2 / 0 -2 2].
 * @author Sean A. Irvine
 */
public class A094434 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094434() {
    super(1, new long[] {-6, 6}, new long[] {0, 2});
  }
}
