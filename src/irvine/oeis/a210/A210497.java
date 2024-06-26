package irvine.oeis.a210;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A210497 a(n) = 2*prime(n+1) - prime(n).
 * a(n)=2*prime(n+1)-prime(n)
 * @author Georg Fischer
 */
public class A210497 extends LambdaSequence {

  /** Construct the sequence. */
  public A210497() {
    super(1, n -> Z.TWO.multiply(Functions.PRIME.z(n + 1)).subtract(Functions.PRIME.z(n)));
  }
}
