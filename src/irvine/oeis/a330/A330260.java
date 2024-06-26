package irvine.oeis.a330;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-27 21:29

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A330260 a(n) = n! * Sum_{k=0..n} binomial(n,k) * n^(n - k) / k!.
 * a(n)=sum(k=0,n,binom(n,k)^2 * n^k * k!)
 * @author Georg Fischer
 */
public class A330260 extends LambdaSequence {

  /** Construct the sequence. */
  public A330260() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n, k).square().multiply(Z.valueOf(n).pow(k)).multiply(Functions.FACTORIAL.z(k))));
  }
}
