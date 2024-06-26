package irvine.oeis.a117;
// Generated by gen_seq4.pl 2024-05-14/multrafd at 2024-05-14 21:53

import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a066.A066495;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A117876 Primes p=prime(k) of level (1,2), i.e., such that A118534(k) = prime(k-2).
 * @author Georg Fischer
 */
public class A117876 extends MultiTransformSequence {

  private static final DirectSequence SEQ = new A000040();

  /** Construct the sequence. */
  public A117876() {
    super(1, (self, n) -> SEQ.a(self.s(0)), "", new A066495().skip(1));
  }
}
