package irvine.oeis.a035;

import irvine.oeis.LinearRecurrence;

/**
 * A035597 Number of points of L1 norm 3 in cubic lattice Z^n.
 * @author Sean A. Irvine
 */
public class A035597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A035597() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 2, 12, 38});
  }
}
