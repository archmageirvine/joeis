package irvine.oeis.a295;
// Generated by gen_seq4.pl 2025-03-06.ack/lambdan at 2025-03-06 22:47

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A295309 Characteristic function for A295307: a(n) = 1 if n &gt; phi(sigma(n)), 0 otherwise.
 * @author Georg Fischer
 */
public class A295309 extends LambdaSequence {

  /** Construct the sequence. */
  public A295309() {
    super(1, n -> (Functions.PHI.z(Functions.SIGMA1.z(n)).compareTo(n) < 0) ? Z.ONE : Z.ZERO);
  }
}
