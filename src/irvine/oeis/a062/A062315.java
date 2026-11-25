package irvine.oeis.a062;

import irvine.math.group.SpecialLinearCyclicSubgroups;
import irvine.oeis.LambdaSequence;

/**
 * A062315 Number of cyclic subgroups of SL(n,4).
 * @author Gregory Morse
 */
public class A062315 extends LambdaSequence {

  /** Construct the sequence. */
  public A062315() {
    super(1, n -> SpecialLinearCyclicSubgroups.overFour(n.intValue()));
  }
}
