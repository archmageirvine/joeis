package irvine.oeis.a326;
// Generated by gen_seq4.pl 2024-11-10.ack/sintrif at 2024-11-10 23:25

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a001.A001519;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A326248 Number of crossing, nesting set partitions of {1..n}.
 * @author Georg Fischer
 */
public class A326248 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A326248() {
    super(0, (term, n) -> Functions.BELL.z(n).subtract(Z.TWO.multiply(Functions.CATALAN.z(n))).add(term), "", new A001519());
  }
}
