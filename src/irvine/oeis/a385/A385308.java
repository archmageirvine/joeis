package irvine.oeis.a385;
// Generated by gen_seq4.pl 2025-07-01.ack/polyx at 2025-07-01 16:42

import irvine.oeis.PolynomialFieldSequence;

/**
 * A385308 Expansion of e.g.f. 1/(1 - 2 * x * cosh(x))^(1/2).
 * 1/(1 - 2 * x * cosh(x))^(1/2).
 * @author Georg Fischer
 */
public class A385308 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A385308() {
    super(0, "[1],[0,2]", "1,1,p1,x,cosh,*,-,^1/2,/", 0, 1);
  }
}
