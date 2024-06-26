package irvine.oeis.a186;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A186170 Number of prime factors times n minus sum of divisors.
 * a(n)=bigomega(n)*n-sigma(n,1)
 * @author Georg Fischer
 */
public class A186170 extends LambdaSequence {

  /** Construct the sequence. */
  public A186170() {
    super(1, n -> Functions.BIG_OMEGA.z(n).multiply(n).subtract(Jaguar.factor(n).sigma(1)));
  }
}
