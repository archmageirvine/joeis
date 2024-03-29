package irvine.oeis.a119;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: 3/2*((1+3*x)/(6*x*sqrt(1-2*x-7*x^2))-1/(6*x))
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A119975 E.g.f. exp(x)*(Bessel_I(0,2*sqrt(2)x) + Bessel_I(1,2*sqrt(2)x)/sqrt(2)).
 * @author Georg Fischer
 */
public class A119975 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A119975() {
    super(0, "[[0],[14,21,7],[62,49,9],[18,9,1],[-12,-7,-1]]", "[1,2,7,22,77]", 3);
  }
}
