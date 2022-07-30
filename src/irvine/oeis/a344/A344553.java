package irvine.oeis.a344;
// manually dfinite/holos at 2022-07-30 10:17

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A344553 Number of lattice paths from (0,0) to (2n-1,n) using steps E=(1,0), N=(0,1), and D=(1,1) which stay weakly above the line through (0,0) and (2n-1,n).
 * Recurrence (n+1)*(2*n+1)*a(n) +3*(-6*n^2-2*n+1)*a(n-1) +(-46*n^2+135*n-98)*a(n-2) -2*(n-2)*(2*n-5)*a(n-3)=0.
 * @author Georg Fischer
 */
public class A344553 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A344553() {
    super(1, "[[0],[-20, 18,-4],[-98, 135,-46],[3,-6,-18],[1, 3, 2]]", "1, 3", 1);
  }
}
