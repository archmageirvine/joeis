package irvine.oeis.a301;

import irvine.oeis.CoordinationSequence;

/**
 * A301202 Coordination sequence <code>T1</code> for Zeolite Code SOS.
 * @author Sean A. Irvine
 */
public class A301202 extends CoordinationSequence {

  /** Construct the sequence. */
  public A301202() {
    super(
      new long[] {1, 4, 10, 19, 30, 42, 56, 64, 64, 57, 43, 31, 19, 9, 3, -3, -9, -18, -31, -42, -56, -65, -63, -57, -43, -30, -20, -10, -4, -1},
      new int[] {4, 5, 6, 14});
  }
}

