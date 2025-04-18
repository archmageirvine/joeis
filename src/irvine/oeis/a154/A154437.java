package irvine.oeis.a154;
// Generated by gen_seq4.pl 2025-04-08.ack/multrar at 2025-04-08 00:02

import irvine.oeis.DirectSequence;
import irvine.oeis.a065.A065190;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A154437 Permutation of nonnegative integers: A059893-conjugate of A154435.
 * @author Georg Fischer
 */
public class A154437 extends MultiTransformSequence {

  private static final DirectSequence A065190 = new A065190();

  /** Construct the sequence. */
  public A154437() {
    super(0, (self, n) -> (n & 1) == 0 ? self.a(A065190.a(n / 2).intValueExact()).multiply(2).add(1) : self.a(n / 2).multiply(2), "0, 1, 3, 2");
  }
}
