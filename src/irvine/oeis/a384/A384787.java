package irvine.oeis.a384;
// Generated by gen_seq4.pl 2025-06-12.ack/polyx at 2025-06-12 21:49

import irvine.oeis.PolynomialFieldSequence;

/**
 * A384787 E.g.f. A(x) satisfies A(x) = exp( x*A(x) * A(2*x*A(x)) ).
 * @author Georg Fischer
 */
public class A384787 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A384787() {
    super(0, "[1],[0,2]", "A,<1,p1,A,*,sub,*,exp", 0, 1);
  }
}
