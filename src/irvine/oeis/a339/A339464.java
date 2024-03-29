package irvine.oeis.a339;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-13 11:40

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A339464 a(n) = (prime(n)-1) / gpf(prime(n)-1) where gpf(m) is the greatest prime factor of m, A006530.
 * a(n) = (prime(n)-1) / gpf(prime(n)-1)
 * @author Georg Fischer
 */
public class A339464 extends LambdaSequence {

  /** Construct the sequence. */
  public A339464() {
    super(2, n -> Puma.primeZ(n).subtract(Z.ONE).divide(Jaguar.factor(Puma.primeZ(n).subtract(Z.ONE)).largestPrimeFactor()));
  }
}
