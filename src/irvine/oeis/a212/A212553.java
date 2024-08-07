package irvine.oeis.a212;
// Generated by gen_seq4.pl 2024-06-23/lambdan at 2024-06-23 23:33

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a000.A000699;
import irvine.oeis.memory.MemorySequence;

/**
 * A212553 Irreducible near matchings over 2n+1 vertices.
 * @author Georg Fischer
 */
public class A212553 extends LambdaSequence {

  private static final MemorySequence A000699 = new A000699();

  /** Construct the sequence. */
  public A212553() {
    super(1, n -> A000699.a(n + 1).multiply(Z.valueOf(2L * n + 1)).multiply(Z.valueOf(n + 1)).divide(Z.valueOf(2L * n)));
  }
}
