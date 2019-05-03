package irvine.oeis.a035;

import irvine.oeis.LinearRecurrence;

/**
 * A035602 Number of points of <code>L1</code> norm 8 in cubic lattice <code>Z^n</code>.
 * @author Sean A. Irvine
 */
public class A035602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A035602() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 2, 32, 258, 1408, 5890, 20256, 59906, 157184});
  }
}
