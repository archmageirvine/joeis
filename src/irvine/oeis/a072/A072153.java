package irvine.oeis.a072;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A072153 Coordination sequence for VPl-5 structure with respect to node (Y) where 18-gon, hexagon and square meet.
 * @author Sean A. Irvine
 */
public class A072153 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A072153() {
    super(0, new long[]{1, 2, 3, 3, 3, 3, 3, 3, 3, 2, 1}, new long[]{1, -1, 1, -1, 0, 0, 0, -1, 1, -1, 1});
  }
}
