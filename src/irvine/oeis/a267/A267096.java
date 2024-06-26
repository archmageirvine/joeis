package irvine.oeis.a267;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-13 11:40

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A267096 a(n) = Product_{i=0..n} prime(i+2)^binomial(n,i).
 * a(n) = prod(i=0,n,prime(i+2)^binom(n,i))
 * @author Georg Fischer
 */
public class A267096 extends LambdaSequence {

  /** Construct the sequence. */
  public A267096() {
    super(0, n -> Integers.SINGLETON.product(0, n, i -> Functions.PRIME.z(i + 2).pow(Binomial.binomial(n, i))));
  }
}
