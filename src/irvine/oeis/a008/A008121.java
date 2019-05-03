package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008121 Coordination sequence <code>T1</code> for Zeolite Code JBW.
 * @author Sean A. Irvine
 */
public class A008121 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008121() {
    super(
      new long[] {1, 4, 10, 21, 37, 51, 53, 45, 29, 0, -29, -45, -53, -51, -37, -21, -10, -4, -1},
      new int[] {4, 4, 5, 5});
  }
}
