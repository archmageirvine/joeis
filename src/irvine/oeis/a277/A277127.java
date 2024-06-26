package irvine.oeis.a277;
// Generated by gen_seq4.pl 2024-05-20/lambdan at 2024-05-20 22:40

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A277127 a(n) = n - lambda(n), where lambda(n) = A002322(n).
 * @author Georg Fischer
 */
public class A277127 extends LambdaSequence {

  /** Construct the sequence. */
  public A277127() {
    super(1, n -> Z.valueOf(n).subtract(Functions.CARMICHAEL_LAMBDA.z(n)));
  }
}
