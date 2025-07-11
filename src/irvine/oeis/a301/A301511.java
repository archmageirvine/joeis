package irvine.oeis.a301;
// Generated by gen_seq4.pl 2025-06-08.ack/polyxa at 2025-06-08 23:06

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a001.A001615;

/**
 * A301511 Expansion of e.g.f. exp(Sum_{k&gt;=1} psi(k)*x^k/k!), where psi() is the Dedekind psi function (A001615).
 * egf(new A001615())
 * @author Georg Fischer
 */
public class A301511 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A301511() {
    super(0, "[1]", "x,B,exp", 0, 1, 1, 1, egf(new A001615()));
  }
}
