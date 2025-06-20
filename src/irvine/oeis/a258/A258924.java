package irvine.oeis.a258;
// Generated by gen_seq4.pl 2025-01-31.ack/polyz at 2025-01-31 23:19

import irvine.oeis.PolynomialFieldSequence;

/**
 * A258924 E.g.f.: S(x) = Series_Reversion( Integral 1/(1-x^5)^(1/5) dx ), where the constant of integration is zero.
 * @author Georg Fischer
 */
public class A258924 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A258924() {
    super(0, "[[1],[1,0,0,0,0,-1]]", ",1,p1,^1/5,/,int,rev", 0, 1, 1, 5);
  }
}
