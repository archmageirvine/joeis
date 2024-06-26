package irvine.oeis.a197;
// Generated by gen_seq4.pl 2024-05-20/lambdan at 2024-05-20 22:40

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A197658 Smallest k such that i^k = i mod n for each i in [0..n-1], or 0 if no such k exists.
 * @author Georg Fischer
 */
public class A197658 extends LambdaSequence {

  /** Construct the sequence. */
  public A197658() {
    super(2, n -> Predicates.SQUARE_FREE.is(n) ? Functions.CARMICHAEL_LAMBDA.z(n).add(1) : Z.ZERO);
  }
}
