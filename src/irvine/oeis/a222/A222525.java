package irvine.oeis.a222;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-27 21:29

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A222525 O.g.f.: Sum_{n&gt;=0} (2*n+1)^(2*n) * exp(-(2*n+1)^2*x) * x^n / n!.
 * a(n)=sum(k=0,n,2^(n+k) * binom(2*n,n+k) * stirl2(n+k,n))
 * @author Georg Fischer
 */
public class A222525 extends LambdaSequence {

  /** Construct the sequence. */
  public A222525() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Z.ONE.shiftLeft(n + k).multiply(Binomial.binomial(2L * n, n + k)).multiply(Functions.STIRLING2.z(n + k, n))));
  }
}
