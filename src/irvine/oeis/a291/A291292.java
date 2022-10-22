package irvine.oeis.a291;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A291292 Necklace Catalan numbers.
 * FindRE((3/2) + (x - sqrt(1 - 4*x))*(2*x - 1)/(6*x - 2),x,a(n));
 * -6*n*(11*n-9)*a(n)+12*(2*n-7)*(n-4)*a(n-3)+(-158*n^2+744*n-862)*a(n-2)+2*(n-1)*(79*n-143)*a(n-1)+(n+1)*(13*n+2)*a(n+1)-(n+1)*(n+2)*a(n+2) = 0
 * @author Georg Fischer
 */
public class A291292 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A291292() {
    super(0, "[[0],[336,-180,24],[-862,744,-158],[286,-444,158],[0,54,-66],[2,15,13],[-2,-3,-1]]", "1,1", 2);
  }
}
