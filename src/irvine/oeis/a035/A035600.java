package irvine.oeis.a035;

import irvine.oeis.LinearRecurrence;

/**
 * A035600 Number of points of L1 norm 6 in cubic lattice Z^n.
 * @author Sean A. Irvine
 */
public class A035600 extends LinearRecurrence {

  /** Construct the sequence. */
  public A035600() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 2, 24, 146, 608, 1970, 5336});
  }
}
