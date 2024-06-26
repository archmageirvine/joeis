package irvine.oeis.a261;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A261464 a(n) = prime(n+2)^3 - prime(n+1)^2 + prime(n).
 * a(n)=prime(n+2)^3-prime(n+1)^2+prime(n)
 * @author Georg Fischer
 */
public class A261464 extends LambdaSequence {

  /** Construct the sequence. */
  public A261464() {
    super(1, n -> Functions.PRIME.z(n + 2).pow(Z.THREE).subtract(Functions.PRIME.z(n + 1).square()).add(Functions.PRIME.z(n)));
  }
}
