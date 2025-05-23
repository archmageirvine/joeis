package irvine.oeis.a355;
// Generated by gen_seq4.pl 2025-04-28.ack/polyx at 2025-04-28 23:36

import irvine.oeis.PolynomialFieldSequence;

/**
 * A355231 E.g.f. A(x) satisfies A'(x) = 1 - 2 * log(1-x) * A(x).
 * E.g.f.A(x) satisfies A'(x) = 1 - 2 * log(1-x) * A(x).nonn    0..23   nyi     _Seiichi Manyama_
 * @author Georg Fischer
 */
public class A355231 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A355231() {
    super(0, "[[0, 1],[1,-1]]", ", 1, 2,p1,log,*,A,*,-,int", 0, 1);
  }
}
