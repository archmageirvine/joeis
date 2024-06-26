package irvine.oeis.a103;
// Generated by gen_seq4.pl 2024-05-14/multrafd at 2024-05-14 21:53

import irvine.oeis.DirectSequence;
import irvine.oeis.a001.A001221;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A103858 Number of distinct prime factors of prime(n)! - prime(n)# + 1.
 * @author Georg Fischer
 */
public class A103858 extends MultiTransformSequence {

  private static final DirectSequence SEQ = new A001221();

  /** Construct the sequence. */
  public A103858() {
    super(1, (self, n) -> SEQ.a(self.s(0)), "", new A103855());
  }
}
