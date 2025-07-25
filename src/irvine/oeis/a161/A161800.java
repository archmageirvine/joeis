package irvine.oeis.a161;
// Generated by gen_seq4.pl 2025-07-21.ack/polya at 2025-07-21 18:34

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a000.A000123;
import irvine.oeis.a002.A002129;

/**
 * A161800 G.f.: A(q) = exp( Sum_{n&gt;=1} A002129(n) * 2*A006519(n) * q^n/n ).
 * new A002129(), new A000123()
 * @author Georg Fischer
 */
public class A161800 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A161800() {
    super(0, "[1]", "x,B,x,C,log,.*,exp", 0, 0, 1, 1, new A002129(), new A000123());
  }
}
