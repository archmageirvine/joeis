package irvine.oeis.a160;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-13 08:51

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A160154 10^n-9n for n&gt;=1.
 * a(n)=10^n-9n
 * @author Georg Fischer
 */
public class A160154 extends LambdaSequence {

  /** Construct the sequence. */
  public A160154() {
    super(0, n -> (n == 0) ? Z.ZERO : Z.TEN.pow(n).subtract(Z.NINE.multiply(n)));
  }
}
