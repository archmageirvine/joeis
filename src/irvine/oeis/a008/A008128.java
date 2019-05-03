package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008128 Coordination sequence <code>T2</code> for Zeolite Code LEV.
 * @author Sean A. Irvine
 */
public class A008128 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008128() {
    super(
      new long[] {1, 4, 10, 20, 32, 44, 55, 65, 70, 62, 41, 14, -14, -41, -62, -70, -65, -55, -44, -32, -20, -10, -4, -1},
      new int[] {5, 5, 6, 7});
  }
}
