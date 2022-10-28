package irvine.oeis.a060;

import irvine.oeis.FixedPointPositionSequence;

/**
 * A060133 Positions of the permutations which have the same rank in A055089 and A060118, i.e., the fixed points of permutations A060120 and A060127.
 * @author Sean A. Irvine
 */
public class A060133 extends FixedPointPositionSequence {

  /** Construct the sequence. */
  public A060133() {
    super(0, new A060120());
  }
}
