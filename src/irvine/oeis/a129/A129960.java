package irvine.oeis.a129;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-27 20:43

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A129960 a(n) = floor(sqrt(2*n!)).
 * a(n)=sqrtint(2*n!)
 * @author Georg Fischer
 */
public class A129960 extends LambdaSequence {

  /** Construct the sequence. */
  public A129960() {
    super(0, n -> Z.TWO.multiply(Functions.FACTORIAL.z(n)).sqrt());
  }
}
