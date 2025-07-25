package irvine.oeis.a110;
// Generated by gen_seq4.pl 2025-07-26.ack/polya at 2025-07-26 21:09

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a056.A056045;

/**
 * A110448 G.f.: A(x) = exp( Sum_{n&gt;=1} A056045(n)/n*x^n ), where A056045(n) = Sum_{d|n} binomial(n,d).
 * new A056045()
 * @author Georg Fischer
 */
public class A110448 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A110448() {
    super(0, "[1]", "x,B,/n,exp", 0, 0, 1, 1, new A056045());
  }
}
