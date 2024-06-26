package irvine.oeis.a214;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A214612 prime(n^3) - prime(n).
 * a(n)=prime(n^3)-prime(n)
 * @author Georg Fischer
 */
public class A214612 extends LambdaSequence {

  /** Construct the sequence. */
  public A214612() {
    super(1, n -> Functions.PRIME.z(Z.valueOf(n).pow(3)).subtract(Functions.PRIME.z(n)));
  }
}
