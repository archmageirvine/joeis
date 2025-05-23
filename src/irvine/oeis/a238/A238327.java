package irvine.oeis.a238;
// Generated by gen_seq4.pl 2025-04-30.ack/multrar at 2025-04-30 23:37

import irvine.math.function.Functions;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A238327 Recursively defined by a(0) = 1, a(n + 1) = p + 2, where p is the least prime greater than a(n).
 * @author Georg Fischer
 */
public class A238327 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A238327() {
    super(0, (self, n) -> Functions.NEXT_PRIME.z(self.a(n - 1)).add(2), "1");
  }
}
