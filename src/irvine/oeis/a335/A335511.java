package irvine.oeis.a335;
// Generated by gen_seq4.pl 2024-07-07/lambdan at 2024-07-07 23:13

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a008.A008480;

/**
 * A335511 Number of (1,1,1)-avoiding permutations of the prime indices of n.
 * @author Georg Fischer
 */
public class A335511 extends LambdaSequence {

  private static final DirectSequence A008480 = new A008480();

  /** Construct the sequence. */
  public A335511() {
    super(1, n -> Predicates.CUBE_FREE.is(n) ? A008480.a(n) : Z.ZERO);
  }
}
