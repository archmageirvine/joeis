package irvine.oeis.a363;
// Generated by gen_seq4.pl 2024-07-11/multrar at 2024-07-11 18:00

import irvine.math.z.Integers;
import irvine.oeis.DirectSequence;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A363801 Expansion of Product_{k&gt;0} (1 - x^(7*k-4)) * (1 - x^(7*k-3)) * (1 - x^(7*k)).
 * @author Georg Fischer
 */
public class A363801 extends MultiTransformSequence {

  private static final DirectSequence A363804 = new A363804();

  /** Construct the sequence. */
  public A363801() {
    super(0, (self, n) -> Integers.SINGLETON.sum(1, n, k -> A363804.a(k).multiply(self.a(n - k))).divide(-n), "1");
  }
}
