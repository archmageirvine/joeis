package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008245 Coordination sequence <code>T1</code> for Zeolite Code VFI.
 * @author Sean A. Irvine
 */
public class A008245 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008245() {
    super(
      new long[] {1, 3, 7, 9, 11, 13, 17, 21, 25, 28, 28, 26, 26, 28, 28, 25, 21, 17, 13, 11, 9, 7, 3, 1},
      new int[] {1, 8, 14});
  }
}
