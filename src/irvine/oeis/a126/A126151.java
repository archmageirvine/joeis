package irvine.oeis.a126;
// Generated by gen_seq4.pl 2025-06-08.ack/polyz at 2025-06-08 23:06

import irvine.oeis.PolynomialFieldSequence;

/**
 * A126151 E.g.f.: ( (1 + cos(sqrt(6)*x))/2 )^(-1/3), showing coefficients of only the even powers of x.
 * @author Georg Fischer
 */
public class A126151 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A126151() {
    super(0, "[1]", "A,^3/2,1,A,^3/2,/,int,*,int,exp", 0, 1, 0, 2);
  }
}
