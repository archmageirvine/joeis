package irvine.oeis.a301;

import irvine.oeis.CoordinationSequence;

/**
 * A301148 Coordination sequence <code>T1</code> for Zeolite Code OSO.
 * @author Sean A. Irvine
 */
public class A301148 extends CoordinationSequence {

  /** Construct the sequence. */
  public A301148() {
    super(
      new long[] {1, 4, 8, 16, 27, 36, 46, 53, 29, 20, -17, -50, -66, -54, -42, -31, 18, 3, -1, 10, -2, -8, 0, 0, -1, 1},
      new int[] {4, 4, 5, 5});
  }
}

