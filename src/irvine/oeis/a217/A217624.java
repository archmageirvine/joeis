package irvine.oeis.a217;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.factor.prime.Puma;
import irvine.oeis.LambdaSequence;

/**
 * A217624 Prime(prime(3*n)).
 * a(n)=prime(prime(3*n))
 * @author Georg Fischer
 */
public class A217624 extends LambdaSequence {

  /** Construct the sequence. */
  public A217624() {
    super(1, n -> Puma.primeZ(Puma.primeZ(3L * n)));
  }
}
