package irvine.oeis.a060;

import irvine.oeis.FixedPointPositionSequence;

/**
 * A060132 Positions of the permutations which have the same rank in A055089 and A060117, i.e., the fixed points of permutations A060119 and A060126.
 * @author Sean A. Irvine
 */
public class A060132 extends FixedPointPositionSequence {

  /** Construct the sequence. */
  public A060132() {
    super(0, new A060119());
  }
}
