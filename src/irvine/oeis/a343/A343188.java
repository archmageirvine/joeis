package irvine.oeis.a343;
// Generated by gen_seq4.pl 2024-11-24.ack/multrar at 2024-11-24 22:15

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A343188 a(1) = a(2) = a(3) = 1; a(n+3) = Sum_{d|n} mu(n/d) * a(d).
 * @author Georg Fischer
 */
public class A343188 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A343188() {
    super(1, (self, n) -> Integers.SINGLETON.sumdiv(n - 3, d -> Functions.MOEBIUS.z((n - 3) / d).multiply(self.a(d))), "1,1,1");
  }
}
