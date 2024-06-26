package irvine.oeis.a324;
// Generated by gen_seq4.pl 2024-05-29/lambdan at 2024-05-29 02:16

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A324982 a(n) = numerator of Sum_{d|n} (pod(d)/tau(d)) where pod(k) = the product of the divisors of k (A007955) and tau(k) = the number of the divisors of k (A000005).
 * @author Georg Fischer
 */
public class A324982 extends LambdaSequence {

  /** Construct the sequence. */
  public A324982() {
    super(1, n -> Rationals.SINGLETON.sumdiv(n, d -> new Q(Jaguar.factor(d).pod(), Functions.TAU.z(d))).num());
  }
}
