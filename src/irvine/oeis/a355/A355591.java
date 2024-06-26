package irvine.oeis.a355;
// Generated by gen_seq4.pl 2024-06-25/multraf at 2024-06-25 23:40

import irvine.oeis.a070.A070826;
import irvine.oeis.a071.A071148;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A355591 a(n) = (product of the first n odd primes) - (sum of the first n odd primes).
 * @author Georg Fischer
 */
public class A355591 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A355591() {
    super(0, (self, n) -> self.s(0).subtract(self.s(1)), "1", new A070826().skip(1), new A071148());
  }
}
