package irvine.oeis.a372;
// Generated by gen_seq4.pl 2024-05-14/multrafd at 2024-05-14 21:53

import irvine.oeis.DirectSequence;
import irvine.oeis.a051.A051903;
import irvine.oeis.a057.A057521;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A372603 The maximal exponent in the prime factorization of the powerful part of n.
 * @author Georg Fischer
 */
public class A372603 extends MultiTransformSequence {

  private static final DirectSequence SEQ = new A051903();

  /** Construct the sequence. */
  public A372603() {
    super(1, (self, n) -> SEQ.a(self.s(0)), "", new A057521());
  }
}
