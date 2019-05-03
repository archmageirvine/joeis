package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008160 Coordination sequence <code>T1</code> for Zeolite Code MER.
 * @author Sean A. Irvine
 */
public class A008160 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008160() {
    super(
      new long[] {1, 3, 5, 8, 11, 11, 8, 5, 3, 1},
      new int[] {1, 3, 5});
  }
}
