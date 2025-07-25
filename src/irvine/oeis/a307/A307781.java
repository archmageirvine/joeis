package irvine.oeis.a307;
// Generated by gen_seq4.pl 2025-07-15.ack/multia at 2025-07-15 23:51

import irvine.math.z.Integers;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A307781 a(1) = 1; a(n+1) = -Sum_{d|n} a(d)^(n/d).
 * @author Georg Fischer
 */
public class A307781 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A307781() {
    super(1, (self, n) -> Integers.SINGLETON.sumdiv(n - 1, d -> self.a(d).pow((n - 1) / d)).negate(), "1");
  }
}
