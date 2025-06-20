package irvine.oeis.a281;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A281182 E.g.f. C(x) + S(x) = exp( Integral C(x)^3 dx ) where C(x) and S(x) are described by A281181 and A281180, respectively.
 * E.g.f.: <code>exp(reverse((sinh(x)/cosh(x)^2+atan(sinh(x)))/2))</code>.
 * @author Georg Fischer
 */
public class A281182 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A281182() {
    super(0, "[1]", "x,sinh,x,cosh,^2,/,x,sinh,atan,+,2,/,rev,exp", 0, 1);
  }
}
