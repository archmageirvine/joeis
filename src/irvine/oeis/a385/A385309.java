package irvine.oeis.a385;
// Generated by gen_seq4.pl 2025-07-01.ack/polyx at 2025-07-01 16:42

import irvine.oeis.PolynomialFieldSequence;

/**
 * A385309 Expansion of e.g.f. 1/(1 - 3 * x * cosh(x))^(1/3).
 * 1/(1 - 3 * x * cosh(x))^(1/3).
 * @author Georg Fischer
 */
public class A385309 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A385309() {
    super(0, "[1],[0,3]", "1,1,p1,x,cosh,*,-,^1/3,/", 0, 1);
  }
}
