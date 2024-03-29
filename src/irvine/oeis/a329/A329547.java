package irvine.oeis.a329;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-27 20:43

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A329547 Number of natural numbers k &lt;= n such that k^k is a square.
 * a(n) = n\2 + (sqrtint(n)+1)\2
 * @author Georg Fischer
 */
public class A329547 extends LambdaSequence {

  /** Construct the sequence. */
  public A329547() {
    super(1, n -> Z.valueOf(n).divide(Z.TWO).add(Z.valueOf(n).sqrt().add(Z.ONE).divide(Z.TWO)));
  }
}
