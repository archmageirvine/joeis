package irvine.oeis.a268;
// Generated by gen_seq4.pl 2024-09-21.ack/multraf at 2024-09-21 22:07

import irvine.oeis.a239.A239295;
import irvine.oeis.a239.A239299;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A268870 Number of sequences in {1,...,n}^n with longest increasing subsequence of length three.
 * @author Georg Fischer
 */
public class A268870 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A268870() {
    super(3, (self, n) -> self.s(0).subtract(self.s(1)), "", new A239299(), new A239295());
  }
}
