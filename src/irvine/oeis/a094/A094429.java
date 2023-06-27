package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094429 Given the 3 X 3 matrix M = [0 1 0 / 0 0 1 / 7 -14 7], a(n) = (-) rightmost term of M^n * [1 1 1].
 * @author Sean A. Irvine
 */
public class A094429 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094429() {
    super(1, new long[] {7, -14, 7}, new long[] {0, 7, 42});
  }
}
