package irvine.oeis.a301;

import irvine.oeis.CoordinationSequence;

/**
 * A301244 Coordination sequence <code>T1</code> for Zeolite Code UEI.
 * @author Sean A. Irvine
 */
public class A301244 extends CoordinationSequence {

  /** Construct the sequence. */
  public A301244() {
    super(
      new long[] {1, 4, 10, 20, 34, 51, 66, 73, 72, 64, 45, 16, -16, -45, -64, -72, -73, -66, -51, -34, -20, -10, -4, -1},
      new int[] {4, 5, 7, 7});
  }
}

