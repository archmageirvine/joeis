package irvine.oeis.a117;
// Generated by gen_seq4.pl 2024-07-24.ack/sintrif at 2024-07-24 22:30

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a079.A079667;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A117002 a(n) = sigma(n) + 3*A079667(n).
 * @author Georg Fischer
 */
public class A117002 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A117002() {
    super(1, (term, n) -> Functions.SIGMA1.z(n).add(Z.THREE.multiply(term)), "", new A079667());
  }
}
