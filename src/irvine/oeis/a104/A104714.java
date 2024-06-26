package irvine.oeis.a104;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A104714 Greatest common divisor of a Fibonacci number and its index.
 * a(n)=gcd(fibonacci(n), n)
 * @author Georg Fischer
 */
public class A104714 extends LambdaSequence {

  /** Construct the sequence. */
  public A104714() {
    super(0, n -> Functions.FIBONACCI.z(n).gcd(n));
  }
}
