package irvine.oeis.a132;
// Generated by gen_seq4.pl 2025-07-08.ack/multia at 2025-07-08 21:48

import irvine.oeis.transform.MultiTransformSequence;

/**
 * A132269 a(n) = Product_{k&gt;=0} (1 + floor(n/2^k)).
 * @author Georg Fischer
 */
public class A132269 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A132269() {
    super(0, (self, n) -> self.a(n / 2).multiply(n + 1), "1");
  }
}
