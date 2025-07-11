package irvine.oeis.a307;
// Generated by gen_seq4.pl 2025-06-28.ack/polya at 2025-06-28 22:36

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a010.A010815;

/**
 * A307059 Expansion of 1/(2 - Product_{k&gt;=1} (1 - x^k)).
 * @author Georg Fischer
 */
public class A307059 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A307059() {
    super(0, "[1]", "1,2,x,B,-,/", 0, 0, 1, 1, new A010815());
  }
}
