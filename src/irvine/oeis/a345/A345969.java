package irvine.oeis.a345;
// Generated by gen_seq4.pl 2025-03-09.ack/polyx at 2025-03-09 21:42

import irvine.oeis.PolynomialFieldSequence;

/**
 * A345969 Expansion of the e.g.f. 1 / sqrt(3 - 2 / ((1 - x)*exp(x))).
 * @author Georg Fischer
 */
public class A345969 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A345969() {
    super(0, "[[1],[1,-1]]", ",1,3,2,p1,x,exp,*,/,-,sqrt,/", 0, 1);
  }
}
