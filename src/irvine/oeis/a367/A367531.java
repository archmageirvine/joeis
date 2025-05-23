package irvine.oeis.a367;
// Generated by gen_seq4.pl 2025-04-08.ack/lambdan at 2025-04-08 00:02

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A367531 The number of ways of tiling the n X n grid up to 90-degree rotation by a tile that is fixed under 180-degree rotation but not 90-degree rotation.
 * @author Georg Fischer
 */
public class A367531 extends LambdaSequence {

  /** Construct the sequence. */
  public A367531() {
    super(1, n -> {
      final int n2 = n / 2 + (n & 1);
      return (n <= 3) ? Z.valueOf(new int[]{0, 1, 6, 136}[n]) : ((n & 1) == 0 ? Z.TWO.pow(n2 * n2 - 2).multiply(Z.TWO.pow(n2 * n2).add(Z.EIGHT.pow(n2 * n2).add(2))) : Z.TWO.pow(2 * n2 * n2 - 4 * n2 - 1).multiply(Z.FOUR.pow(n2).add(Z.FOUR.pow(n2 * n2))));
    });
  }
}
