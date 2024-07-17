package irvine.oeis.a320;

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A320534 a(n) = ((1 + sqrt(4*n^2 + 1))^n + (1 - sqrt(4*n^2 + 1))^n)/2^n.
 * @author Georg Fischer
 */
public class A320534 extends LambdaSequence {

  /** Construct the sequence. */
  public A320534() {
    // a(n) = 2^(1 - n) * Sum_{k=0..floor(n/2)} binomial(n, 2*k)*(4*n^2 + 1)^k.
    super(0, n -> Q.TWO.pow(1 - n).multiply(Rationals.SINGLETON.sum(0, n / 2, k -> new Q(Binomial.binomial(n, 2L * k).multiply(Z.valueOf(n).square().multiply(4).add(1).pow(k))))).num());
  }
}
