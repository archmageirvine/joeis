package irvine.oeis.a038;

import irvine.oeis.CoordinationSequence;

/**
 * A038407 Coordination sequence <code>T2</code> for Zeolite Code AWO.
 * @author Sean A. Irvine
 */
public class A038407 extends CoordinationSequence {

  /** Construct the sequence. */
  public A038407() {
    super(
      new long[] {1, 4, 10, 21, 35, 48, 62, 75, 77, 65, 43, 15, -15, -43, -65, -77, -75, -62, -48, -35, -21, -10, -4, -1},
      new int[] {4, 5, 7, 7});
  }
}
