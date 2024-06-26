package irvine.oeis.a182;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A182212 a(n) = floor(n! / Fibonacci(n)).
 * a(n)=floor(n!/fibonacci(n))
 * @author Georg Fischer
 */
public class A182212 extends LambdaSequence {

  /** Construct the sequence. */
  public A182212() {
    super(1, n -> Functions.FACTORIAL.z(n).divide(Functions.FIBONACCI.z(n)));
  }
}
