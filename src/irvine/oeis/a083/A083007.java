package irvine.oeis.a083;
// Generated by gen_seq4.pl 2024-03-07/lambdan at 2024-03-07 22:01

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A083007 a(n) = Sum_{k=0..n-1} 3^k*B(k)*C(n,k) where B(k) is the k-th Bernoulli number and C(n,k)=binomial(n,k).
 * @author Georg Fischer
 */
public class A083007 extends LambdaSequence {

  /** Construct the sequence. */
  public A083007() {
    super(0, n -> {
      final BernoulliSequence bs = new BernoulliSequence(0);
      return Rationals.SINGLETON.sum(0, n - 1, k -> Q.THREE.pow(k).multiply(Binomial.binomial(n, k)).multiply(bs.nextQ())).num();
    });
  }
}
