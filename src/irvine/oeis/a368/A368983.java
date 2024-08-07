package irvine.oeis.a368;
// Generated by gen_seq4.pl 2024-07-24.ack/multraf at 2024-07-24 22:30

import irvine.oeis.a027.A027852;
import irvine.oeis.a068.A068051;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A368983 Number of connected graphs with loops (symmetric relations) on n unlabeled vertices with n edges.
 * @author Georg Fischer
 */
public class A368983 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A368983() {
    super(0, (self, n) -> self.s(0).subtract(self.s(1)), "1", new A068051(), new A027852());
  }
}
