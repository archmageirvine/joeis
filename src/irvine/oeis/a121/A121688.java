package irvine.oeis.a121;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A121688 G.f.: Sum_{n&gt;=0} x^n * (1+x)^(2^n).
 * a(n)=sum(k=0,n,binom(2^k,n-k))
 * @author Georg Fischer
 */
public class A121688 extends LambdaSequence {

  /** Construct the sequence. */
  public A121688() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(Z.ONE.shiftLeft(k), n - k)));
  }
}
