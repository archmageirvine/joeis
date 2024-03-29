package irvine.oeis.a099;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-21 21:22

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A099168 a(n) = 3^n * 5^binomial(n,2).
 * @author Georg Fischer
 */
public class A099168 extends LambdaSequence {

  /** Construct the sequence. */
  public A099168() {
    super(0, n -> Z.THREE.pow(n).multiply(Z.FIVE.pow(Binomial.binomial(n, 2))));
  }
}
