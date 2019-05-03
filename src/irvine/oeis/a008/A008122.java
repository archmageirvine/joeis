package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008122 Coordination sequence <code>T2</code> for Zeolite Code JBW.
 * @author Sean A. Irvine
 */
public class A008122 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008122() {
    super(
      new long[] {1, 4, 12, 24, 34, 46, 54, 46, 27, 0, -27, -46, -54, -46, -34, -24, -12, -4, -1},
      new int[] {4, 4, 5, 5});
  }
}
