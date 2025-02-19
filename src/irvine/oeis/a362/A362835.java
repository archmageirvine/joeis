package irvine.oeis.a362;
// Generated by gen_seq4.pl 2025-02-16.ack/polyx at 2025-02-16 22:50

import irvine.oeis.PolynomialFieldSequence;

/**
 * A362835 Expansion of e.g.f. 1/(1 + LambertW(x * log(1-x))).
 * 1/(1+lambertW(x*log(1-x)))
 * @author Georg Fischer
 */
public class A362835 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A362835() {
    super(0, "[[1]]", ";1;1;x;1;x;-;log;*;lambertW;+;/", 0, 1);
  }
}
