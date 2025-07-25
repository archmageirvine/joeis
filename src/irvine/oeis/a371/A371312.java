package irvine.oeis.a371;
// Generated by gen_seq4.pl 2025-07-17.ack/polyxa at 2025-07-18 00:03

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a005.A005651;

/**
 * A371312 Expansion of e.g.f. Product_{k&gt;=1} 1 / (1 - x^k/k!)^2.
 * egf(new A005651())
 * @author Georg Fischer
 */
public class A371312 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A371312() {
    super(0, "[1]", "x,B,^2", 0, 1, 1, 1, egf(new A005651()));
  }
}
