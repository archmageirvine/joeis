package irvine.oeis.a281;
// Generated by gen_seq4.pl 2025-06-08.ack/polyx at 2025-06-08 23:06

import irvine.oeis.PolynomialFieldSequence;

/**
 * A281817 a(n) = 2*Sum_{k odd} k!*Stirling2(n,k)/(k + 1).
 * @author Georg Fischer
 */
public class A281817 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A281817() {
    super(0, "[0,1],[0,-1]", "p1,2,x,exp,-,log,-,x,exp,1,-,/", 1, 1);
  }
}
