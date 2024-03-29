package irvine.oeis.a071;
// Generated by gen_seq4.pl hologfm/hologf at 2022-12-01 18:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A071757 Expansion of (1+x^4*C^4)*C^4, where C = (1-(1-4*x)^(1/2))/(2*x) is g.f. for Catalan numbers, A000108.
 * @author Georg Fischer
 */
public class A071757 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A071757() {
    // o.g.f. 1/16*(1+1/16*(1-(1-4*x)^(1/2))^4)*(1-(1-4*x)^(1/2))^4/x^4
    // recurrence -(n-1)*(n+4)*(3*(n-1)^2+6*n+5)*u(n)+2*(2*n-1)*n*(3*(n-1)^2+12*n+8)*u(n-1) = 0
    super(0, "[[0],[0,-22, 32, 18, 12],[32,-24, 4,-9,-3]]", "[1, 4]", 0);
  }
}
