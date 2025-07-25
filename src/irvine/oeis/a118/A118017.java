package irvine.oeis.a118;
// Generated by gen_seq4.pl 2025-07-11.ack/multia at 2025-07-11 21:53

import irvine.oeis.transform.MultiTransformSequence;

/**
 * A118017 Largest denominators in even Egyptian fraction representation of 1.
 * @author Georg Fischer
 */
public class A118017 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A118017() {
    super(1, (self, n) -> self.a(n - 1).square().divide(2).add(self.a(n - 1)), "12");
  }
}
