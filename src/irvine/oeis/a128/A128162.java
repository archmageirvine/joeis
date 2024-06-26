package irvine.oeis.a128;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-25 11:10

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A128162 a(n) = 3^n modulo Fibonacci(n).
 * a(n)=3^n%fibonacci(n)
 * @author Georg Fischer
 */
public class A128162 extends LambdaSequence {

  /** Construct the sequence. */
  public A128162() {
    super(1, n -> Z.THREE.pow(n).mod(Functions.FIBONACCI.z(n)));
  }
}
