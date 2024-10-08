package irvine.oeis.a279;
// Generated by gen_seq4.pl 2024-09-21.ack/multraf at 2024-09-21 22:07

import irvine.oeis.a053.A053262;
import irvine.oeis.a259.A259910;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A279135 Coefficients of the '5th-order' mock theta function Phi(q) with a(0)=1.
 * @author Georg Fischer
 */
public class A279135 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A279135() {
    super(0, (self, n) -> self.s(0).add(self.s(1)).divide(3), "1", new A053262(), new A259910());
  }
}
