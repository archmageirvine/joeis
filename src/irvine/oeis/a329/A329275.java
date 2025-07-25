package irvine.oeis.a329;
// Generated by gen_seq4.pl 2025-06-28.ack/polya at 2025-06-28 22:36

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a001.A001037;

/**
 * A329275 Expansion of 1 / (1 + Sum_{k&gt;=1} mu(k) * log(1 - 2 * x^k) / k), where mu = A008683.
 * new A001037()
 * @author Georg Fischer
 */
public class A329275 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A329275() {
    super(0, "[1]", "1,1,x,B,1,-,-,/", 0, 0, 1, 1, new A001037());
  }
}
