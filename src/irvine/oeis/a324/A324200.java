package irvine.oeis.a324;
// Generated by gen_seq4.pl 2024-07-27.ack/multraf at 2024-07-27 22:17

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000043;
import irvine.oeis.a000.A000668;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A324200 a(n) = 2^(A000043(n)-1) * ((2^A059305(n)) - 1), where A059305 gives the prime index of the n-th Mersenne prime, while A000043 gives its exponent.
 * @author Georg Fischer
 */
public class A324200 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A324200() {
    super(1, (self, n) -> Z.TWO.pow(Functions.PRIME_PI.z(self.s(0))).subtract(Z.ONE).multiply(Z.TWO.pow(self.s(1).subtract(Z.ONE))), "", new A000668(), new A000043());
  }
}
