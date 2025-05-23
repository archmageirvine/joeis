package irvine.oeis.a343;
// Generated by gen_seq4.pl 2025-04-09.ack/multia at 2025-04-09 21:37

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A343190 a(1) = ... = a(5) = 1; a(n+5) = Sum_{d|n} mu(n/d) * a(d).
 * @author Georg Fischer
 */
public class A343190 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A343190() {
    super(1, (self, n) -> Integers.SINGLETON.sumdiv(n - 5, d -> Functions.MOEBIUS.z((n - 5) / d).multiply(self.a(d))), "1, 1, 1, 1, 1");
  }
}
