package irvine.oeis.a353;
// Generated by gen_seq4.pl 2024-06-16/lambdan at 2024-06-16 23:57

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A353487 a(n) = A276086(2*n) mod 4, where A276086 is the primorial base exp-function.
 * @author Georg Fischer
 */
public class A353487 extends LambdaSequence {

  /** Construct the sequence. */
  public A353487() {
    super(0, n -> Functions.PRIMORIAL_BASE_EXP.z(2 * n).modZ(4));
  }
}
