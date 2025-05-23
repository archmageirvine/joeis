package irvine.oeis.a347;
// Generated by gen_seq4.pl 2025-05-11.ack/multia at 2025-05-11 22:56

import irvine.math.z.Integers;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A347028 a(1) = 1; a(n+1) = -Sum_{k=1..n} a(floor(n/k)).
 * @author Georg Fischer
 */
public class A347028 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A347028() {
    super(1, (self, n) -> Integers.SINGLETON.sum(1, n - 1, k -> self.a((n - 1) / k)).negate(), "1");
  }
}
