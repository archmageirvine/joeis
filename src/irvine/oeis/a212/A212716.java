package irvine.oeis.a212;
// Generated by gen_seq4.pl 2025-03-16.ack/lambdan at 2025-03-16 17:02

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A212716 Denominator of Sum_{k=1..n} 1/lambda(k), where  lambda(k) is the Carmichael's lambda function.
 * @author Georg Fischer
 */
public class A212716 extends LambdaSequence {

  /** Construct the sequence. */
  public A212716() {
    super(1, n -> Rationals.SINGLETON.sum(1, n, k -> new Q(1, Functions.CARMICHAEL_LAMBDA.z(k))).den());
  }
}
