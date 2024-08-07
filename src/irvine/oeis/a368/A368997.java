package irvine.oeis.a368;
// Generated by gen_seq4.pl 2024-07-24.ack/multraf at 2024-07-24 22:30

import irvine.oeis.a035.A035263;
import irvine.oeis.a358.A358680;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A368997 a(n) = 1 if A342001(n) is even, otherwise 0.
 * @author Georg Fischer
 */
public class A368997 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A368997() {
    super(1, (self, n) -> self.s(0).multiply(self.s(1)), "", new A035263(), new A358680());
  }
}
