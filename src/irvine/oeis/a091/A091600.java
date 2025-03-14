package irvine.oeis.a091;
// Generated by gen_seq4.pl 2025-02-16.ack/polyx at 2025-02-16 22:50

import irvine.oeis.PolynomialFieldSequence;

/**
 * A091600 Expansion of solution to xA(x)(A(x)-x+1)=A(xA(x)).
 * A(x)= x +(A(x*A(x))-x*A(x))/(x*A(x))
 * @author Georg Fischer
 */
public class A091600 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A091600() {
    super(0, "[[0,1,1,1,2,4]]", ",x,A,<1,sub,A,<1,-,A,<1,/,+", 4, 0);
  }
}
