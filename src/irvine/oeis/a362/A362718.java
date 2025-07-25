package irvine.oeis.a362;
// Generated by gen_seq4.pl 2025-07-03.ack/polyz at 2025-07-03 22:12

import irvine.oeis.PolynomialFieldSequence;

/**
 * A362718 Expansion of e.g.f. cos(x)*exp(x^2/2) = Sum_{n&gt;=0} a(n)*x^(2*n)/(2*n)!.
 * @author Georg Fischer
 */
public class A362718 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A362718() {
    super(0, "[1],[0,0,1/2]", "x,cos,p1,exp,*", 0, 1, 0, 2);
  }
}
