package irvine.oeis.a066;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-13 11:40

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A066798 a(n) = Sum_{i=1..n} binomial(6*i,3*i).
 * a(n) = sum(i=1,n,binom(6*i,3*i))
 * @author Georg Fischer
 */
public class A066798 extends LambdaSequence {

  /** Construct the sequence. */
  public A066798() {
    super(1, n -> Integers.SINGLETON.sum(1, n, i -> Binomial.binomial(6L * i, 3L * i)));
  }
}
