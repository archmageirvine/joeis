package irvine.oeis.a288;
// Generated by gen_seq4.pl 2025-07-08.ack/polyx at 2025-07-08 21:48

import irvine.oeis.PolynomialFieldSequence;

/**
 * A288867 Numerators of the z-sequence for the Sheffer matrix S2*P = A048993*A007318 = A049020.
 * @author Georg Fischer
 */
public class A288867 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A288867() {
    super(0, "[1],[1, 1]", "x,exp, 1,-,p1,log,x,exp,*,/", 1, 1);
  }
}
