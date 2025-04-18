package irvine.oeis.a081;
// Generated by gen_seq4.pl 2025-04-02/polyx at 2025-04-02 21:51

import irvine.oeis.PolynomialFieldSequence;

/**
 * A081560 Binomial transform of expansion of exp(cosh(2*x)).
 * @author Georg Fischer
 */
public class A081560 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A081560() {
    super(0, "[[1],[0,2],[-1,1]]", ",p1,cosh,p2,+,exp", 0, 1);
  }
}
