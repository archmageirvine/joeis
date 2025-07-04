package irvine.oeis.a198;
// Generated by gen_seq4.pl 2025-06-08.ack/polyxa at 2025-06-08 23:06

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a002.A002898;

/**
 * A198802 Number of closed paths of length n whose steps are 18th roots of unity, U_18(n).
 * egf(new A002898())
 * @author Georg Fischer
 */
public class A198802 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A198802() {
    super(0, "[1]", "x,B,^3", 0, 1, 1, 1, egf(new A002898()));
  }
}
