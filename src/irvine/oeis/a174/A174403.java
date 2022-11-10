package irvine.oeis.a174;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A174403 Expansion of (1-2*x-2*x^2-sqrt(1-4*x-4*x^2+8*x^3+4*x^4))/(2*x^2).
 * @author Georg Fischer
 */
public class A174403 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A174403() {
    // (n+2)*a(n) -2*(2*n+1)*a(n-1) +4*(1-n)*a(n-2) +4*(2*n-5)*a(n-3) +4*(n-4)*a(n-4)=0
    super(0, "[[0],[-16,4],[-20,8],[4,-4],[-2,-4],[2,1]]", "1,2,7", 0);
  }
}
