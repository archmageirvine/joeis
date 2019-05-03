package irvine.oeis.a301;

import irvine.oeis.CoordinationSequence;

/**
 * A301150 Coordination sequence <code>T1</code> for Zeolite Code OWE.
 * @author Sean A. Irvine
 */
public class A301150 extends CoordinationSequence {

  /** Construct the sequence. */
  public A301150() {
    super(
      new long[] {1, 4, 9, 18, 34, 53, 66, 73, 80, 88, 87, 65, 33, 9, -9, -33, -65, -87, -88, -80, -73, -66, -53, -34, -18, -9, -4, -1},
      new int[] {4, 6, 7, 10});
  }
}

