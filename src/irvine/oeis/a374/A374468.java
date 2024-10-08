package irvine.oeis.a374;
// Generated by gen_seq4.pl 2024-08-16.ack/parity at 2024-08-16 19:15

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A374468 Parity of the digit sum of n in factorial base.
 * @author Georg Fischer
 */
public class A374468 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A374468() {
    super(0, (term, n) -> term.testBit(0) ? Z.ONE : Z.ZERO, new LambdaSequence(0, n -> Functions.DIGIT_SUM.z(Functions.FACTORIAL_BASE.z(n))));
  }
}
