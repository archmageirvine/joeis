package irvine.oeis.a386;
// Generated by gen_seq4.pl 2025-07-25.ack/multia at 2025-07-25 21:47

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A386506 allocated for Seiichi Manyama.
 * @author Georg Fischer
 */
public class A386506 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A386506() {
    super(0, (self, n) -> self.a(n - 1).add(Integers.SINGLETON.sum(0, n - 1, k -> Z.valueOf(1 + k).multiply(Z.valueOf(k).pow(3)).multiply(Binomial.binomial(n - 1, k)).multiply(self.a(k)).multiply(self.a(n - 1 - k)))), "1");
  }
}
