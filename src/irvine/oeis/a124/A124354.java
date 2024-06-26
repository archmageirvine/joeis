package irvine.oeis.a124;
// Generated by gen_seq4.pl 2024-05-13/lambdan at 2024-05-13 22:33

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A124354 Orders of the automorphisms groups of the n-antiprism graph.
 * @author Georg Fischer
 */
public class A124354 extends LambdaSequence {

  /** Construct the sequence. */
  public A124354() {
    super(3, n -> n == 3 ? Z.valueOf(48) : Z.valueOf(n).shiftLeft(2));
  }
}
