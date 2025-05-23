package irvine.oeis.a367;
// Generated by gen_seq4.pl 2025-04-08.ack/lambdan at 2025-04-08 00:02

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A367532 The number of ways of tiling the n X n grid up to 90-degree rotation by a tile that is not fixed under 180-degree rotation.
 * @author Georg Fischer
 */
public class A367532 extends LambdaSequence {

  /** Construct the sequence. */
  public A367532() {
    super(1, n -> {
      final int n2 = n / 2 + (n & 1);
      return (n & 1) == 1 ? Z.valueOf(256).pow(n2 * (n2 - 1)) : Z.FOUR.pow(n2 * n2 - 1).multiply(Z.FOUR.pow(n2 * n2).add(2).add(Z.valueOf(64).pow(n2 * n2)));
    });
  }
}
