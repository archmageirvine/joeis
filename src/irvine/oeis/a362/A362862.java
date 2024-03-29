package irvine.oeis.a362;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A362862 a(n) = (-1)^n * Sum_{k=0..n} (-n*k)^k * binomial(n,k).
 * a(n) = (-1)^n * sum(k=0,n,(-n*k)^k*binom(n,k));
 * @author Georg Fischer
 */
public class A362862 extends LambdaSequence {

  /** Construct the sequence. */
  public A362862() {
    super(0, n -> Z.NEG_ONE.pow(n).multiply(Integers.SINGLETON.sum(0, n, k -> Z.valueOf((long) -n * k).pow(k).multiply(Binomial.binomial(n, k)))));
  }
}
