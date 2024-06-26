package irvine.oeis.a332;
// Generated by gen_seq4.pl 2024-06-17/lambdan at 2024-06-17 23:19

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a087.A087808;
import irvine.oeis.memory.MemorySequence;

/**
 * A332224 a(n) = A087808(sigma(n)).
 * @author Georg Fischer
 */
public class A332224 extends LambdaSequence {

  private static final MemorySequence A087808 = new A087808();

  /** Construct the sequence. */
  public A332224() {
    super(1, n -> A087808.a(Functions.SIGMA.z(1, n)));
  }
}
