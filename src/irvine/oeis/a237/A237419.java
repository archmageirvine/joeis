package irvine.oeis.a237;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A237419 4^(n+1)^2 - 3.
 * a(n)=(4^(n+1)^2-3)
 * @author Georg Fischer
 */
public class A237419 extends LambdaSequence {

  /** Construct the sequence. */
  public A237419() {
    super(0, n -> Z.FOUR.pow(Z.valueOf(n + 1).square()).subtract(Z.THREE));
  }
}
