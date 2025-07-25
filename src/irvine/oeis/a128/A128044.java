package irvine.oeis.a128;
// Generated by gen_seq4.pl 2025-07-17.ack/polyx at 2025-07-18 00:03

import irvine.oeis.PolynomialFieldSequence;

/**
 * A128044 a(n) = numerator of b(n), where b(1) = 1, b(n) = Sum_{k=1..n-1} b(n-k) * H(k); H(k) = Sum_{j=1..k} 1/j, the k-th harmonic number.
 * @author Georg Fischer
 */
public class A128044 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A128044() {
    super(1, "[1],[1,-1]", "x,1,p1,log,p1,/,+,/", 0, 0);
  }
}
