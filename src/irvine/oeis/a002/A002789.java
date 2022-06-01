package irvine.oeis.a002;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A002789 Number of integer points in a certain quadrilateral scaled by a factor of n.
 * @author Sean A. Irvine
 */
public class A002789 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A002789() {
    super(new long[] {2, 2, 1},
      new long[] {1, -1, -1, 0, 1, 1, -1});
  }
}
