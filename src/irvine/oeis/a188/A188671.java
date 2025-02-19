package irvine.oeis.a188;
// Generated by gen_seq4.pl 2024-11-19.ack/sintrif at 2024-11-19 23:27

import irvine.math.z.Z;
import irvine.oeis.a000.A000145;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A188671 A000145(n) / 8 - (n^5 + 1).
 * @author Georg Fischer
 */
public class A188671 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A188671() {
    super(1, (term, n) -> term.divide(8).subtract(Z.valueOf(n).pow(5).add(1)), "", new A000145());
  }
}
