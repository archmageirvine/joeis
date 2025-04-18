package irvine.oeis.a282;
// Generated by gen_seq4.pl 2025-02-13.ack/prepend at 2025-02-13 23:28

import irvine.oeis.PrependSequence;
import irvine.oeis.a053.A053267;

/**
 * A282537 Coefficients of the '5th-order' mock theta function Psi(q) with a(0)=1.
 * @author Georg Fischer
 */
public class A282537 extends PrependSequence {

  /** Construct the sequence. */
  public A282537() {
    super(0, new A053267().skip(1), 1);
  }
}
