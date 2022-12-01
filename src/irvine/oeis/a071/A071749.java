package irvine.oeis.a071;
// manually hologfm/hologf at 2022-12-01 17:28

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A071749 Expansion of (1+x^4*C^2)*C^4, where C = (1-(1-4*x)^(1/2))/(2*x) is g.f. for Catalan numbers, A000108.
 * @author Georg Fischer
 */
public class A071749 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A071749() {
    // o.g.f. 1/16*(1+1/4*x^2*(1-(1-4*x)^(1/2))^2)*(1-(1-4*x)^(1/2))^4/x^4
    // recurrence -(n+4)*(131*(n-1)^4+326*(n-1)^3+109*(n-1)^2-134*n+302)*u(n)+2*(2*n-3)*(131*(n-1)^4+850*(n-1)^3+1873*(n-1)^2+1586*n-986)*u(n-1) = 0
    super(0, "[[0],[-1008, 1476,-1190,-1520, 518, 524],[-864,-624, 230, 875,-326,-131]]", "1, 4, 14", 0);
  }
}
