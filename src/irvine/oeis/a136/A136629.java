package irvine.oeis.a136;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A136629 Number of labeled PQ-trees with n leaves.
 * E.g.f.: <code>reverse(-exp(x)+(-2+x*(-2+x*(4+x)))/(2*(-1+x)))</code>.
 * @author Georg Fischer
 */
public class A136629 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A136629() {
    super(0, "[1],[4,1],[-1,1]", "0,x,exp,-,0,2,-,x,0,2,-,x,p1,*,+,*,+,2,p2,*,/,+,rev", 0, 1);
  }
}
