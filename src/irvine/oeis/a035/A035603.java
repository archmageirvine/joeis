package irvine.oeis.a035;

import irvine.oeis.LinearRecurrence;

/**
 * A035603 Number of points of <code>L1</code> norm 9 in cubic lattice <code>Z^n</code>.
 * @author Sean A. Irvine
 */
public class A035603 extends LinearRecurrence {

  /** Construct the sequence. */
  public A035603() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 2, 36, 326, 1992, 9290, 35436, 115598, 332688, 864146});
  }
}
