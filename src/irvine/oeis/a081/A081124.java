package irvine.oeis.a081;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-27 21:29

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A081124 Binomial transform of floor(n/2)!.
 * a(n)=sum(k=0,n,binom(n,k)*floor(k/2)!)
 * @author Georg Fischer
 */
public class A081124 extends LambdaSequence {

  /** Construct the sequence. */
  public A081124() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n, k).multiply(Functions.FACTORIAL.z(k / 2))));
  }
}
