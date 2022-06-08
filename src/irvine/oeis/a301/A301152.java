package irvine.oeis.a301;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A301152 Coordination sequence T3 for Zeolite Code OWE.
 * @author Sean A. Irvine
 */
public class A301152 extends CoordinationSequence {

  /** Construct the sequence. */
  public A301152() {
    super(
      new long[] {1, 4, 11, 22, 31, 44, 61, 71, 70, 50, 22, 0, -22, -50, -70, -71, -61, -44, -31, -22, -11, -4, -1},
      new int[] {4, 5, 6, 7});
  }
}

