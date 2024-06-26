package irvine.oeis.a076;
// Generated by gen_seq4.pl dirtraf/lambdan at 2024-02-06 22:08

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A076359 a(n) = denominator(n!/phi(n!)).
 * @author Georg Fischer
 */
public class A076359 extends LambdaSequence {

  /** Construct the sequence. */
  public A076359() {
    super(1, n -> {
      final Z fa = Functions.FACTORIAL.z(n);
      return new Q(fa, Functions.PHI.z(fa)).den();
    });
  }
}
