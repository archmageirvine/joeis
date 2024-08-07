package irvine.oeis.a288;
// Generated by gen_seq4.pl 2024-07-27.ack/lambdan at 2024-07-27 22:17

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A288654 a(n) = (sigma(n)-n-1)*(3-omega(n)).
 * @author Georg Fischer
 */
public class A288654 extends LambdaSequence {

  /** Construct the sequence. */
  public A288654() {
    super(1, n -> Functions.SIGMA1.z(n).subtract(Z.valueOf(n)).subtract(Z.ONE).multiply(Z.THREE.subtract(Functions.OMEGA.z(n))));
  }
}
