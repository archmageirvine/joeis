package irvine.oeis.a072;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A072151 Coordination sequence for AlPO_4-11 structure with respect to node (Z) where decagon, hexagon and square meet and is not adjacent to node of type (X).
 * @author Sean A. Irvine
 */
public class A072151 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A072151() {
    super(0, new long[]{1, 3, 6, 9, 13, 15, 16, 16, 16, 15, 13, 9, 6, 3, 1}, new long[]{1, 0, 1, -1, 0, -1, 0, 0, 0, -1, 0, -1, 1, 0, 1});
  }
}
