package irvine.oeis.a275;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A275989 a(n) = prime(prime(n)+1) - prime(n).
 * a(n)=prime(prime(n)+1)-prime(n)
 * @author Georg Fischer
 */
public class A275989 extends LambdaSequence {

  /** Construct the sequence. */
  public A275989() {
    super(1, n -> Puma.primeZ(Puma.primeZ(n).add(Z.ONE)).subtract(Puma.primeZ(n)));
  }
}
