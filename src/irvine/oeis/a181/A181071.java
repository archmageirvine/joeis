package irvine.oeis.a181;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-21 21:22

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A181071 a(n) = Sum_{k=0..floor(n/2)} binomial(n-k,k)^(k+1) * n/(n-k).
 * @author Georg Fischer
 */
public class A181071 extends LambdaSequence {

  /** Construct the sequence. */
  public A181071() {
    super(1, n -> Integers.SINGLETON.sum(0, n / 2, k -> Binomial.binomial(n - k, k).pow(Z.valueOf(k + 1)).multiply(n).divide(Z.valueOf(n - k))));
  }
}
