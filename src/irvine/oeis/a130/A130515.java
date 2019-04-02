package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130515 In triangular peg solitaire, number of distinct feasible pairs starting with one peg missing and finishing with one peg.
 * @author Sean A. Irvine
 */
public class A130515 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130515() {
    super(new long[] {1, 0, 0, -3, 0, 0, 1, 0, 0, 5, 0, 0, -5, 0, 0, -1, 0, 0, 3, 0, 0}, new long[] {1, 4, 3, 17, 29, 27, 80, 125, 108, 260, 356, 300, 637, 832, 675, 1341, 1665, 1323, 2500, 3025, 2352});
  }
}
