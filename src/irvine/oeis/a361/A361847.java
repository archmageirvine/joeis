package irvine.oeis.a361;
// Generated by gen_seq4.pl 2024-03-07/lambdan at 2024-03-07 22:01

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A361847 a(n) = (-1)^n * Sum_{k=0..n} 9^k * binomial(-1/3,k) * binomial(n*k,n-k).
 * @author Georg Fischer
 */
public class A361847 extends LambdaSequence {

  /** Construct the sequence. */
  public A361847() {
    super(0, n -> Z.NEG_ONE.pow(n).multiply(Rationals.SINGLETON.sum(0, n, k -> Binomial.binomial(new Q(-1, 3), k).multiply(Z.NINE.pow(k)).multiply(Binomial.binomial((long) n * k, n - k))).num()));
  }
}
