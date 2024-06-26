package irvine.oeis.a334;
// Generated by gen_seq4.pl 2024-04-24/lambdan at 2024-04-24 18:19

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A334746 Denominator of Sum_{k=1..n} 1/(prime(k) - 1)^2.
 * @author Georg Fischer
 */
public class A334746 extends LambdaSequence {

  /** Construct the sequence. */
  public A334746() {
    super(1, n -> Rationals.SINGLETON.sum(1, n, k -> new Q(Z.ONE, Functions.PRIME.z(k).subtract(1).square())).den());
  }
}
