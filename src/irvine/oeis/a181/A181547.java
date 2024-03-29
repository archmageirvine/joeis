package irvine.oeis.a181;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-21 21:22

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A181547 a(n) = Sum_{k=0..floor(n/2)} C(n-k,k)^5.
 * @author Georg Fischer
 */
public class A181547 extends LambdaSequence {

  /** Construct the sequence. */
  public A181547() {
    super(0, n -> Integers.SINGLETON.sum(0, n / 2, k -> Binomial.binomial(n - k, k).pow(Z.FIVE)));
  }
}
