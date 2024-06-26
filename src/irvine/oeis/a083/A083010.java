package irvine.oeis.a083;
// Generated by gen_seq4.pl 2024-03-07/lambdan at 2024-03-07 22:01

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A083010 a(n) = 6^n(B_n(1/6)-B_n(0)) where B_n(x) is the n-th Bernoulli polynomial.
 * @author Georg Fischer
 */
public class A083010 extends LambdaSequence {

  /** Construct the sequence. */
  public A083010() {
    super(0, n -> {
      final BernoulliSequence bs = new BernoulliSequence(0);
      return Rationals.SINGLETON.sum(0, n - 1, k -> Q.SIX.pow(k).multiply(Binomial.binomial(n, k)).multiply(bs.nextQ())).num();
    });
  }
}
