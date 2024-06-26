package irvine.oeis.a088;
// Generated by gen_seq4.pl 2024-04-17/multraf at 2024-04-17 19:29

import irvine.oeis.a002.A002110;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A088860 Twice the primorials (first definition), 2*A002110(n).
 * @author Georg Fischer
 */
public class A088860 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A088860() {
    super(1, (self, n) -> self.s(0).multiply(2), "", new A002110());
  }
}
