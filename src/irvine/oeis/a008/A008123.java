package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008123 Coordination sequence <code>T1</code> for Zeolite Code KFI.
 * @author Sean A. Irvine
 */
public class A008123 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008123() {
    super(
      new long[] {1, 2, 2, 3, 4, 4, 3, 2, 2, 1},
      new int[] {1, 1, 7});
  }
}
