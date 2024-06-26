package irvine.oeis.a073;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A073131 a(n) = prime(prime(n+1)) - prime(prime(n)).
 * @author Georg Fischer
 */
public class A073131 extends LambdaSequence {

  /** Construct the sequence. */
  public A073131() {
    super(1, n -> Functions.PRIME.z(Functions.PRIME.z(n + 1)).subtract(Functions.PRIME.z(Functions.PRIME.z(n))));
  }
}
