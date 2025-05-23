package irvine.oeis.a355;
// Generated by gen_seq4.pl 2024-12-15.ack/multrar at 2024-12-15 23:09

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A355121 E.g.f. A(x) satisfies A(x) = 1 - log(1-x) * A(-2 * log(1-x)).
 * @author Georg Fischer
 */
public class A355121 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A355121() {
    super(0, (self, n) -> Integers.SINGLETON.sum(1, n, k -> Z.valueOf(k).multiply(Z.TWO.pow(k - 1)).multiply(Functions.STIRLING1.z(n, k).abs()).multiply(self.a(k - 1))), "1");
  }
}
