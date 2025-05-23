package irvine.oeis.a197;
// Generated by gen_seq4.pl 2025-04-20.ack/multia at 2025-04-20 22:06

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A197953 a(n) = 1 + Sum_{d|n, d&gt;1} d * a(n/d).
 * @author Georg Fischer
 */
public class A197953 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A197953() {
    super(1, (self, n) -> Integers.SINGLETON.sumdiv(n, d -> d <= 1 ? Z.ZERO : self.a(n / d).multiply(d)).add(1), "1");
  }
}
