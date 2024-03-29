package irvine.oeis.a359;
// Generated by gen_seq4.pl 2024-01-06/lambdan at 2024-01-08 19:23

import irvine.factor.factor.Jaguar;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A359071 Numerators of the partial sums of the reciprocals of the maximal exponent in prime factorization of the positive integers (A051903).
 * @author Georg Fischer
 */
public class A359071 extends LambdaSequence {

  /** Construct the sequence. */
  public A359071() {
    super(2, n -> Rationals.SINGLETON.sum(2, n, k -> new Q(Z.ONE, Z.valueOf(Jaguar.factor(k).maxExponent()))).num());
  }
}
