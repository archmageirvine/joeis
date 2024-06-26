package irvine.oeis.a213;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A213926 prime(n^2) - prime(n).
 * a(n)=prime(n^2)-prime(n)
 * @author Georg Fischer
 */
public class A213926 extends LambdaSequence {

  /** Construct the sequence. */
  public A213926() {
    super(1, n -> Functions.PRIME.z(n * n).subtract(Functions.PRIME.z(n)));
  }
}
