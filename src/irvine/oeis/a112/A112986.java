package irvine.oeis.a112;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A112986 Crossing number of K_{4,n} on the real projective plane.
 * @author Sean A. Irvine
 */
public class A112986 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112986() {
    super(new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {0, 0, 0, 3, 5, 7, 18});
  }
}
