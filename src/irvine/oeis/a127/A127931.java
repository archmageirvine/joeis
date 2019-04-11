package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127931 Numbers n such that 13 divides <code>11*n + 2^n</code>.
 * @author Sean A. Irvine
 */
public class A127931 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127931() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 6, 9, 23, 29, 70, 72, 103, 112, 128, 147, 157});
  }
}
