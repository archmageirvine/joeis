package irvine.oeis.a071;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A071742 Expansion of (1+x^4*C)*C, where C = (1-(1-4*x)^(1/2))/(2*x) is g.f. for Catalan numbers, A000108.
 * @author Georg Fischer
 */
public class A071742 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A071742() {
    // (65*n^4-418*n^3+655*n^2+298*n-840)*a(n)+(-260*n^4+2062*n^3-5500*n^2+5618*n-1680)*a(n-1) = 0
    super(0, "[[0],[-1680,5618,-5500,2062,-260],[-840,298,655,-418,65]]", "1,1,2,5,15", 0);
  }
}
