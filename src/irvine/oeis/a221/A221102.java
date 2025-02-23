package irvine.oeis.a221;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A221102 E.g.f. satisfies: A(x) = 1 + x*Sum_{n&gt;=0} log( A(x)^n )^n / n!.
 * 1+x/(1+lambertW(-log(A(x))))
 * @author Georg Fischer
 */
public class A221102 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A221102() {
    super(0, "[[1]]", ";1;x;1;0;A;log;-;lambertW;+;/;+", 0, 1);
  }
}
