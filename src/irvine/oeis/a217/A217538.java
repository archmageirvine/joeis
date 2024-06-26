package irvine.oeis.a217;
// Generated by gen_seq4.pl 2023-11-05/lambdan at 2023-11-05 20:02

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A217538 Integer part of the n-th partial sum of the reciprocal primes gaps.
 * @author Georg Fischer
 */
public class A217538 extends LambdaSequence {

  /** Construct the sequence. */
  public A217538() {
    super(1, n -> Rationals.SINGLETON.sum(1, n, i -> new Q(Z.ONE, Functions.PRIME.z(i + 1).subtract(Functions.PRIME.z(i)))).floor());
  }
}
