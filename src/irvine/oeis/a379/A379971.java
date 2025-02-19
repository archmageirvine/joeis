package irvine.oeis.a379;
// Generated by gen_seq4.pl 2025-02-02.ack/lambdan at 2025-02-02 21:39

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A379971 a(n) = 1 if n^2-1 is squarefree, otherwise 0.
 * @author Georg Fischer
 */
public class A379971 extends LambdaSequence {

  /** Construct the sequence. */
  public A379971() {
    super(1, n -> (n == 1) ? Z.ZERO : Predicates.SQUARE_FREE.is(Z.valueOf(n).multiply(n).subtract(1)) ? Z.ONE : Z.ZERO);
  }
}
