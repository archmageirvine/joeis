package irvine.oeis.a351;
// Generated by gen_seq4.pl 2025-02-16.ack/polyx at 2025-02-16 22:50

import irvine.oeis.PolynomialFieldSequence;

/**
 * A351515 Expansion of e.g.f. (exp(exp(exp(exp(exp(x)-1)-1)-1)-1)-1)^2 / 2.
 * (exp(exp(exp(exp(exp(x)-1)-1)-1)-1)-1)^2/2
 * @author Georg Fischer
 */
public class A351515 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A351515() {
    super(2, "[[0,0,1]]", ";x;exp;1;-;exp;1;-;exp;1;-;exp;1;-;exp;1;-;^2;2;/", 0, 1);
  }
}
