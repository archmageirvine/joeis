package irvine.oeis.a301;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A301151 Coordination sequence T2 for Zeolite Code OWE.
 * @author Sean A. Irvine
 */
public class A301151 extends CoordinationSequence {

  /** Construct the sequence. */
  public A301151() {
    super(
      new long[] {1, 4, 9, 19, 33, 48, 65, 75, 82, 92, 87, 66, 36, 9, -9, -36, -66, -87, -92, -82, -75, -65, -48, -33, -19, -9, -4, -1},
      new int[] {4, 6, 7, 10});
  }
}

