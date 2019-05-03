package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008117 Coordination sequence <code>T2</code> for Zeolite Code HEU.
 * @author Sean A. Irvine
 */
public class A008117 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008117() {
    super(
      new long[] {1, 4, 11, 23, 38, 49, 62, 77, 58, 13, -23, -61, -106, -144, -146, -108, -61, -23, 13, 56, 77, 64, 49, 38, 23, 11, 4, 1},
      new int[] {4, 5, 5, 6, 7});
  }
}
