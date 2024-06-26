package irvine.oeis.a302;
// Generated by gen_seq4.pl 2024-06-17/lambdan at 2024-06-17 23:19

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a052.A052330;
import irvine.oeis.memory.MemorySequence;

/**
 * A302783 A divisor-or-multiple permutation of natural numbers: a(n) = A052330(A006068(n)).
 * @author Georg Fischer
 */
public class A302783 extends LambdaSequence {

  private static final MemorySequence A052330 = new A052330();

  /** Construct the sequence. */
  public A302783() {
    super(0, n -> A052330.a(Functions.GRAY_DECODE.z(n)));
  }
}
