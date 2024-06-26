package irvine.oeis.a355;
// Generated by gen_seq4.pl 2024-04-17/multrar at 2024-04-17 19:29

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A355211 E.g.f. A(x) satisfies A'(x) = 1 + A(2 * (1 - exp(-x))).
 * @author Georg Fischer
 */
public class A355211 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A355211() {
    super(1, (self, n) -> Integers.SINGLETON.sum(1, n - 1, k -> Z.NEG_ONE.pow(n - 1 - k).multiply(Z.TWO.pow(k)).multiply(Functions.STIRLING2.z(n - 1, k)).multiply(self.a(k))), "1");
  }
}
