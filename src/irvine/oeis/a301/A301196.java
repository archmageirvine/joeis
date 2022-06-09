package irvine.oeis.a301;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A301196 Coordination sequence T2 for Zeolite Code SFO.
 * @author Sean A. Irvine
 */
public class A301196 extends CoordinationSequence {

  /** Construct the sequence. */
  public A301196() {
    super(
      new long[] {1, 4, 9, 17, 26, 33, 42, 50, 47, 40, 37, 28, 11, -5, -23, -45, -62, -74, -88, -96, -88, -74, -62, -45, -23, -5, 11, 28, 37, 40, 47, 50, 42, 33, 26, 17, 9, 4, 1},
      new int[] {3, 5, 7, 11, 12});
  }
}

