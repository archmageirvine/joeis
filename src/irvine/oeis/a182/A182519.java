package irvine.oeis.a182;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A182519 a(n) = prime(n)^(n+1) - prime(n+1)^n.
 * a(n)=prime(n)^(n+1)-prime(n+1)^n
 * @author Georg Fischer
 */
public class A182519 extends LambdaSequence {

  /** Construct the sequence. */
  public A182519() {
    super(1, n -> Functions.PRIME.z(n).pow(Z.valueOf(n + 1)).subtract(Functions.PRIME.z(n + 1).pow(n)));
  }
}
