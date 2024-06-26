package irvine.oeis.a100;
// Generated by gen_seq4.pl 2024-06-23/lambdan at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A100845 a(n) = L(P(n)), where P = A000041 (partition numbers) and L = A000032 (Lucas numbers).
 * @author Georg Fischer
 */
public class A100845 extends LambdaSequence {

  /** Construct the sequence. */
  public A100845() {
    super(0, n -> Functions.LUCAS.z(Functions.PARTITIONS.z(n)));
  }
}
