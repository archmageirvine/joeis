package irvine.oeis.a355;
// Generated by gen_seq4.pl 2024-04-17/multrar at 2024-04-17 19:29

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A355103 E.g.f. A(x) satisfies A(x) = 1 + 3 * x * A(1 - exp(-x)).
 * @author Georg Fischer
 */
public class A355103 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A355103() {
    super(0, (self, n) -> Integers.SINGLETON.sum(0, n - 1, k -> Z.NEG_ONE.pow(n - k - 1).multiply(Functions.STIRLING2.z(n - 1, k)).multiply(self.a(k))).multiply(3L * n), "1");
  }
}
