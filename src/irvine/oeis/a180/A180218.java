package irvine.oeis.a180;
// manually simplified 2021-01-28

import irvine.oeis.HolonomicRecurrence;

/**
 * A180218 a(n) = (n+2)!*sum(1/k, k=1..n).
 * a(n) = (n+2)/n *((2*n-1)*a(n-1) - (n^2-1)*a(n-2)).
 * (-n^3-2*n^2+n+2)*a(n-2)+(2*n^2+3*n-2)*a(n-1)-n*a(n)=0.
 *
 * @author Georg Fischer
 */
public class A180218 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A180218() {
    super(0, "[[0],[2, 1,-2,-1],[-2, 3, 2],[0,-1]]", "[0, 6]", 0);
  }
}
