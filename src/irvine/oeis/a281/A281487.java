package irvine.oeis.a281;
// Generated by gen_seq4.pl 2025-07-06.ack/multia at 2025-07-06 20:53

import irvine.math.z.Integers;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A281487 a(n+1) = -Sum_{d|n} a(d), a(1) = 1.
 * @author Georg Fischer
 */
public class A281487 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A281487() {
    super(1, (self, n) -> Integers.SINGLETON.sumdiv(n - 1, d -> self.a(d)).negate(), "1");
  }
}
