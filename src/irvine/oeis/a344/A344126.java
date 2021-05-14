package irvine.oeis.a344;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A344126 Coordination sequence for the hypertriangular lattice.
 * @author Sean A. Irvine
 */
public class A344126 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A344126() {
    super(new long[] {1, 5, 18, 22, 28, 16, 7, -3, 2}, new long[] {1, -1, 0, -2, 2, 0, 1, -1});
  }
}
