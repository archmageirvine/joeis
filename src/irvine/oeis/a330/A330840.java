package irvine.oeis.a330;
// Generated by gen_seq4.pl 2024-07-26/multraf at 2024-07-27 00:11

import irvine.math.z.Z;
import irvine.oeis.a133.A133049;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A330840 a(n) = 4*M(n)^2*(M(n)+1)^2, where M(n) is the n-th Mersenne prime, A000668.
 * @author Georg Fischer
 */
public class A330840 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A330840() {
    super(1, (self, n) -> Z.FOUR.multiply(self.s(0)).multiply(self.s(1)), "", new A133049(), new A330824());
  }
}
