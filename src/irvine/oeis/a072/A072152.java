package irvine.oeis.a072;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A072152 Coordination sequence for VPl-5 structure with respect to node (X) where 18-gon and two squares meet.
 * @author Sean A. Irvine
 */
public class A072152 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A072152() {
    super(0, new long[]{1, 2, 2, 4, 4, 4, 6, 7, 5, 5, 5, 4, 2, 2, 2, 1, -1, -1}, new long[]{1, -1, 1, -1, 1, -1, 1, -2, 1, -1, 1, -1, 1, -1, 1});
  }
}
