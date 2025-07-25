package irvine.oeis.a354;
// Generated by gen_seq4.pl 2025-06-10.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A354317 Expansion of e.g.f. exp(-log(1 + x)^2 / 2).
 * E.g.f.: <code>1/(1+x)^(log(1+x)/2)</code>.
 * @author Georg Fischer
 */
public class A354317 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A354317() {
    super(0, "[1],[1,1]", "1,p1,p1,log,2,/,pow,/", 0, 1);
  }
}
