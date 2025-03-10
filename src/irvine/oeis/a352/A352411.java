package irvine.oeis.a352;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A352411 E.g.f.: x / LambertW( x/(1-x) ).
 * x/lambertW(x/(1-x))
 * @author Georg Fischer
 */
public class A352411 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A352411() {
    super(0, "[[1]]", ";x;x;1;x;-;/;lambertW;/", 1, 1);
  }
}
