package irvine.oeis.a329;
// Generated by gen_seq4.pl 2024-06-24/lambdan at 2024-06-24 23:40

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a000.A000629;

/**
 * A329712 The number of rooted chains in the lattice of (0, 1) matrices of order n.
 * @author Georg Fischer
 */
public class A329712 extends LambdaSequence {

  private static final DirectSequence A000629 = new A000629();

  /** Construct the sequence. */
  public A329712() {
    super(0, n -> A000629.a(Z.valueOf(n).square()));
  }
}
