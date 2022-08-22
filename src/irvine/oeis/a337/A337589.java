package irvine.oeis.a337;
// manually 2022-08-22

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A337589 Expansion of (x^3-1+sqrt((x^4+x^3+4*x^2+x+1)*(x^2-x+1)))/(2*x^2).
 * Recurrence: (n+2)*a(n) +4*(n-1)*a(n-2) +(-2*n+5)*a(n-3) +4*(n-4)*a(n-4) +(n-7)*a(n-6)=0.
 * @author Georg Fischer
 */
public class A337589 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A337589() {
    super(0, "[[0],[-7, 1],[0],[-16, 4],[5,-2],[-4, 4],[0],[2, 1]]", "[1, 0, 0, 1, 0,-2]", 0);
  }
}
