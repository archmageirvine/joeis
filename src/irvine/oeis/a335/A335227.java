package irvine.oeis.a335;
// Generated by gen_seq4.pl 2024-07-11/multrar at 2024-07-11 18:00

import irvine.math.z.Integers;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000593;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A335227 G.f.: x / (Sum_{k&gt;=1} k * x^k / (1 + x^k)).
 * @author Georg Fischer
 */
public class A335227 extends MultiTransformSequence {

  private static final DirectSequence A000593 = new A000593();

  /** Construct the sequence. */
  public A335227() {
    super(0, (self, n) -> Integers.SINGLETON.sum(1, n, k -> A000593.a(k + 1).multiply(self.a(n - k))).negate(), "1");
  }
}
