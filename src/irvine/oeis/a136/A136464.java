package irvine.oeis.a136;
// Generated by gen_seq4.pl 2024-03-07/lambdan at 2024-03-07 22:01

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A136464 C((n+1)*2^(n-1),n)/(n+1).
 * @author Georg Fischer
 */
public class A136464 extends LambdaSequence {

  /** Construct the sequence. */
  public A136464() {
    super(0, n -> new Q(Binomial.binomial(Z.valueOf(n + 1).multiply(Z.TWO.pow(n - 1)), n), Z.valueOf(n + 1)).num());
  }
}
