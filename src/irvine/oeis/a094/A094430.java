package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094430 a(n) is the rightmost term of M^n * [1 0 0], where M is the 3 X 3 matrix [0 1 0 / 0 0 1 / 7 -14 7].
 * @author Sean A. Irvine
 */
public class A094430 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094430() {
    super(1, new long[] {7, -14, 7}, new long[] {7, 49, 245});
  }
}
