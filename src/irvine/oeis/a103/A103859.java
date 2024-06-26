package irvine.oeis.a103;
// Generated by gen_seq4.pl 2024-05-14/multrafd at 2024-05-14 21:53

import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000005;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A103859 Number of divisors of prime(n)! - prime(n)# + 1.
 * @author Georg Fischer
 */
public class A103859 extends MultiTransformSequence {

  private static final DirectSequence SEQ = new A000005();

  /** Construct the sequence. */
  public A103859() {
    super(1, (self, n) -> SEQ.a(self.s(0)), "", new A103855());
  }
}
