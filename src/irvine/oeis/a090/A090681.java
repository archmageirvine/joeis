package irvine.oeis.a090;
// Generated by gen_seq4.pl 2025-06-10.ack/polyez

import irvine.oeis.PolynomialFieldSequence;

/**
 * A090681 Expansion of (sec(x/2)^2 + sech(x/2)^2)/2 in powers of x^4.
 * E.g.f.: <code>(sec(x/2)^2+sech(x/2)^2)/2</code>.
 * @author Georg Fischer
 */
public class A090681 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A090681() {
    super(0, "[1],[0,1/2]", "p1,sec,^2,p1,sech,^2,+,2,/", 0, 1, 0, 4);
  }
}
