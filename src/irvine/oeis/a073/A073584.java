package irvine.oeis.a073;
// Generated by gen_seq4.pl 2024-11-21.ack/sintrif at 2024-11-21 23:03

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000702;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A073584 Commuting even permutations: number of ordered pairs g, h in the alternating group A_n such that gh = hg.
 * @author Georg Fischer
 */
public class A073584 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A073584() {
    super(1, (term, n) -> (n == 1) ? Z.ONE : Functions.FACTORIAL.z(n).divide(2).multiply(term), "1", new A000702());
  }
}
