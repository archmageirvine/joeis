package irvine.oeis.a224;
// Generated by gen_seq4.pl 2025-06-15.ack/polya at 2025-06-15 21:33

import irvine.oeis.PolynomialFieldSequence;

/**
 * A224340 G.f.: exp( Sum_{n&gt;=1} A113184(n^2)*x^n/n ), where A113184(n) = difference between sum of odd divisors of n and sum of even divisors of n.
 * new A224339()
 * @author Georg Fischer
 */
public class A224340 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A224340() {
    super(0, "[1]", "x,B,x,/,int,exp", 0, 0, 1, 1, new A224339());
  }
}
