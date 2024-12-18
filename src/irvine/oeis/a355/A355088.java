package irvine.oeis.a355;
// Generated by gen_seq4.pl 2024-12-15.ack/multrar at 2024-12-15 23:09

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A355088 E.g.f. A(x) satisfies A(x) = 1 + (exp(x) - 1) * A(3*x).
 * @author Georg Fischer
 */
public class A355088 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A355088() {
    super(0, (self, n) -> Integers.SINGLETON.sum(0, n - 1, k -> Z.THREE.pow(k).multiply(Binomial.binomial(n, k)).multiply(self.a(k))), "1");
  }
}
