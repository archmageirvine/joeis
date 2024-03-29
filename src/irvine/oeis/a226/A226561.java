package irvine.oeis.a226;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-25 11:10

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A226561 a(n) = Sum_{d|n} d^n * phi(d), where phi(n) is the Euler totient function A000010(n).
 * a(n) = sum(k=1,n,(n/gcd(k,n))^n);
 * @author Georg Fischer
 */
public class A226561 extends LambdaSequence {

  /** Construct the sequence. */
  public A226561() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> Z.valueOf(n).divide(Z.valueOf(k).gcd(n)).pow(n)));
  }
}
