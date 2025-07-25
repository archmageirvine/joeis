package irvine.oeis.a343;
// Generated by gen_seq4.pl 2025-07-18.ack/rambdan at 2025-07-18 22:19

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.RationalLambdaSequence;

/**
 * A343206 Numerators of Daehee numbers.
 * @author Georg Fischer
 */
public class A343206 extends RationalLambdaSequence {

  /** Construct the sequence. */
  public A343206() {
    super(0, NUM, n -> new Q(Z.NEG_ONE.pow(n).multiply(Functions.FACTORIAL.z(n)), Z.valueOf(n + 1)));
  }
}
