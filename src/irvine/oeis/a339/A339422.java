package irvine.oeis.a339;
// Generated by gen_seq4.pl 2024-07-11/multrar at 2024-07-11 18:00

import irvine.math.z.Integers;
import irvine.oeis.DirectSequence;
import irvine.oeis.a209.A209229;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A339422 G.f.: 1 / (1 + Sum_{k&gt;=0} x^(2^k)).
 * @author Georg Fischer
 */
public class A339422 extends MultiTransformSequence {

  private static final DirectSequence A209229 = new A209229();

  /** Construct the sequence. */
  public A339422() {
    super(0, (self, n) -> Integers.SINGLETON.sum(1, n, k -> A209229.a(k).multiply(self.a(n - k))).negate(), "1");
  }
}
