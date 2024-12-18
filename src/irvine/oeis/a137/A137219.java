package irvine.oeis.a137;
// Generated by gen_seq4.pl 2024-11-19.ack/multraf at 2024-11-19 23:27

import irvine.math.z.Z;
import irvine.oeis.a001.A001850;
import irvine.oeis.a126.A126086;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A137219 a(n) = (A126086(n) - 3*A001850(n) + 2)/6.
 * @author Georg Fischer
 */
public class A137219 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A137219() {
    super(1, (self, n) -> self.s(0).subtract(Z.THREE.multiply(self.s(1))).add(2).divide(6), "", new A126086(), new A001850());
  }
}
