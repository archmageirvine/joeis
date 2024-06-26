package irvine.oeis.a243;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A243896 a(n) = prime(n^2+1).
 * a(n)=prime(n^2+1)
 * @author Georg Fischer
 */
public class A243896 extends LambdaSequence {

  /** Construct the sequence. */
  public A243896() {
    super(0, n -> Functions.PRIME.z(n * n + 1));
  }
}
