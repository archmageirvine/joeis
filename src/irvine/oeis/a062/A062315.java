package irvine.oeis.a062;

import irvine.math.group.SpecialLinearCyclicSubgroups;
import irvine.oeis.LambdaSequence;

/**
 * A062315 Number of cyclic subgroups of the group SL(n,4) (the group of nonsingular n X n matrices over GF(4) with determinant 1 ).
 * @author Gregory Morse
 */
public class A062315 extends LambdaSequence {

  /** Construct the sequence. */
  public A062315() {
    super(1, n -> SpecialLinearCyclicSubgroups.overFour(n.intValue()));
  }
}
