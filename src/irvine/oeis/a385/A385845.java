package irvine.oeis.a385;
// Generated by gen_seq4.pl 2025-07-13.ack/multia at 2025-07-13 21:23

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A385845 G.f. A(x) satisfies A(x) = 1/((1 - x) * (1 - x^4*A'''(x))).
 * @author Georg Fischer
 */
public class A385845 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A385845() {
    super(0, (self, n) -> Integers.SINGLETON.sum(0, n - 1, k -> Z.valueOf(k).pow(3).subtract(Z.valueOf(k).multiply(3 * k)).add(2 * k).multiply(self.a(k)).multiply(self.a(n - 1 - k))).add(1), "1");
  }
}
