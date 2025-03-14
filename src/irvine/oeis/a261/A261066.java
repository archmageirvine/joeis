package irvine.oeis.a261;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A261066 a(n) = (7^(2^n) - 1) / 2^(n+2).
 * a(n)=(7^(2^n)-1)/2^(n+2)
 * @author Georg Fischer
 */
public class A261066 extends LambdaSequence {

  /** Construct the sequence. */
  public A261066() {
    super(1, n -> Z.SEVEN.pow(Z.ONE.shiftLeft(n)).subtract(Z.ONE).divide(Z.ONE.shiftLeft(n + 2)));
  }
}
