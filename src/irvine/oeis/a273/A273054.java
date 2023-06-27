package irvine.oeis.a273;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A273054 Numbers n such that 19*n^2 + 20 is a square.
 * @author Sean A. Irvine
 */
public class A273054 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273054() {
    super(1, new long[] {-1, 0, 340, 0}, new long[] {4, 22, 1382, 7484});
  }
}
