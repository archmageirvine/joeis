package irvine.oeis.a087;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A087949 G.f. satisfies A(x) = 1 + x*A(x*A(x)).
 * 1+x*A(x*A(x))
 * @author Georg Fischer
 */
public class A087949 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A087949() {
    super(0, "[[1]]", ";1;x;x;A;*;sub;*;+", 0, 0);
  }
}
