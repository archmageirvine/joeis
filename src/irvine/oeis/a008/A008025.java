package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008025 Coordination sequence <code>T3</code> for Zeolite Code AFS and BPH.
 * @author Sean A. Irvine
 */
public class A008025 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008025() {
    super(
      new long[] {1, 4, 9, 18, 30, 43, 62, 85, 103, 127, 161, 177, 181, 187, 167, 135, 128, 111, 56, 0, -56, -111, -128, -135, -167, -187, -181, -177, -161, -127, -103, -85, -62, -43, -30, -18, -9, -4, -1},
      new int[] {8, 8, 10, 12});
  }
}

