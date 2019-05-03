package irvine.oeis.a301;

import irvine.oeis.CoordinationSequence;

/**
 * A301197 Coordination sequence <code>T3</code> for Zeolite Code SFO.
 * @author Sean A. Irvine
 */
public class A301197 extends CoordinationSequence {

  /** Construct the sequence. */
  public A301197() {
    super(
      new long[] {1, 4, 9, 17, 25, 32, 43, 52, 48, 39, 35, 26, 11, -2, -19, -43, -62, -75, -91, -100, -91, -75, -62, -43, -19, -2, 11, 26, 35, 39, 48, 52, 43, 32, 25, 17, 9, 4, 1},
      new int[] {3, 5, 7, 11, 12});
  }
}

