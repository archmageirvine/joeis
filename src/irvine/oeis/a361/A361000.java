package irvine.oeis.a361;
// Generated by gen_seq4.pl 2024-07-24.ack/sintrif at 2024-07-24 22:30

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a083.A083039;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A361000 Number of tilings of an n X 3 rectangle by integer-sided rectangular pieces that cannot be rearranged to produce a different tiling of the rectangle (including rotations and reflections of the original tiling).
 * @author Georg Fischer
 */
public class A361000 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A361000() {
    super(1, (term, n) -> Z.TWO.multiply(Functions.SIGMA0.z(n)).subtract(term), "2, 3, 2", new A083039());
  }
}
