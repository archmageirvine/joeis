package irvine.oeis.a245;
// Generated by gen_seq4.pl 2024-12-08.ack/filtpos at 2024-12-08 22:31

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a002.A002635;

/**
 * A245022 Integers with precisely three partitions into sums of four squares of nonnegative numbers.
 * @author Georg Fischer
 */
public class A245022 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A245022() {
    super(1, 0, new A002635(), v -> v.equals(Z.THREE));
  }
}
