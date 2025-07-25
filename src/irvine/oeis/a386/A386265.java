package irvine.oeis.a386;
// Generated by gen_seq4.pl 2025-07-21.ack/multia at 2025-07-21 18:34

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A386265 G.f. A(x) satisfies A(x) = 1/(1+x) + x^2 * (d/dx A(x)^2).
 * @author Georg Fischer
 */
public class A386265 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A386265() {
    super(0, (self, n) -> Integers.SINGLETON.sum(0, n - 1, k -> self.a(k).multiply(self.a(n - 1 - k))).multiply(n - 1).add(Z.NEG_ONE.pow(n)), "1");
  }
}
