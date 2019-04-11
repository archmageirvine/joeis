package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094429 Given the 3 X 3 matrix M <code>= [0 1 0 / 0 0 1 / 7 -14 7], a(n) = (-)</code> rightmost term of M^n <code>* [1 1 1]</code>.
 * @author Sean A. Irvine
 */
public class A094429 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094429() {
    super(new long[] {7, -14, 7}, new long[] {0, 7, 42});
  }
}
