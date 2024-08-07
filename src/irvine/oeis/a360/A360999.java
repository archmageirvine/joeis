package irvine.oeis.a360;
// Generated by gen_seq4.pl 2024-07-24.ack/sintrif at 2024-07-24 22:30

import irvine.math.function.Functions;
import irvine.oeis.a114.A114003;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A360999 Number of tilings of an n X 2 rectangle by integer-sided rectangular pieces that cannot be rearranged to produce a different tiling of the rectangle (including rotations and reflections of the original tiling).
 * @author Georg Fischer
 */
public class A360999 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A360999() {
    super(1, (term, n) -> term.add(Functions.PARITY.z(n)).subtract(1), "2, 2", new A114003());
  }
}
