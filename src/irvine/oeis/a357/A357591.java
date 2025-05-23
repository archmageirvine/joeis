package irvine.oeis.a357;
// Generated by gen_seq4.pl 2025-02-16.ack/polyx at 2025-02-16 22:50

import irvine.oeis.PolynomialFieldSequence;

/**
 * A357591 Expansion of e.g.f. (exp(x) - 1) * tan((exp(x) - 1)/2).
 * (exp(x)-1)*tan((exp(x)-1)/2)
 * @author Georg Fischer
 */
public class A357591 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A357591() {
    super(0, "[[1]]", ";x;exp;1;-;x;exp;1;-;2;/;tan;*", 0, 1);
  }
}
