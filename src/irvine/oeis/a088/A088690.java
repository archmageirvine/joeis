package irvine.oeis.a088;
// Generated by gen_seq4.pl 2025-06-10.ack/polyx at 2025-06-10 21:36

import irvine.oeis.PolynomialFieldSequence;

/**
 * A088690 E.g.f.: A(x) = f(x*A(x)), where f(x) = (1+x)*exp(x).
 * @author Georg Fischer
 */
public class A088690 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A088690() {
    super(0, "[1],[0,-1],[1,1]", "p1,exp,<1,p2,/,rev,x,/", 1, 1);
  }
}
