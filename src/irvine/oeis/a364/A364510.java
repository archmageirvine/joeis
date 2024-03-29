package irvine.oeis.a364;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-27 21:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A364510 a(n) = binomial(4*n, n)^2.
 * a(n)=sum(i=-n,n,(-1)^i * binom(2*n,n+i)^2 * binom(4*n,2*n+i))
 * @author Georg Fischer
 */
public class A364510 extends LambdaSequence {

  /** Construct the sequence. */
  public A364510() {
    super(0, n -> Integers.SINGLETON.sum(-n, n, i -> Z.NEG_ONE.pow(i).multiply(Binomial.binomial(2L * n, n + i).square()).multiply(Binomial.binomial(4L * n, 2L * n + i))));
  }
}
