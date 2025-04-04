package irvine.oeis.a180;
// Generated by gen_seq4.pl 2025-04-04.ack/multrar at 2025-04-04 23:53

import irvine.math.z.Integers;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A180086 Sum of n and floor of each previous term divided by its distance from n.
 * @author Georg Fischer
 */
public class A180086 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A180086() {
    super(1, (self, n) -> Integers.SINGLETON.sum(1, n - 1, k -> self.a(n - k).divide(k)).add(n), "1");
  }
}
