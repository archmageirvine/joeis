package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008105 Coordination sequence <code>T1</code> for Zeolite Code FAU.
 * @author Sean A. Irvine
 */
public class A008105 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008105() {
    super(
      new long[] {1, 3, 5, 7, 9, 12, 15, 16, 15, 12, 9, 7, 5, 3, 1},
      new int[] {1, 6, 7});
  }
}
