package irvine.oeis.a101;
// manually dfinite/holos at 2022-07-30 11:44

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A101308 Number of ordered trees with n edges and having no branches of length 2.
 * Recurrence (n+2)*a(n) +(-5*n-4)*a(n-1) +(7*n+2)*a(n-2) +(-4*n-5)*a(n-3) +(-7*n+31)*a(n-4) +3*(5*n-22)*a(n-5) +2*(-8*n+41)*a(n-6) +9*(n-6)*a(n-7) +3*(-n+7)*a(n-8)=0.
 * @author Georg Fischer
 */
public class A101308 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A101308() {
    super(0, "[[0],[21,-3],[-54, 9],[82,-16],[-66, 15],[31,-7],[-5,-4],[2, 7],[-4,-5],[2, 1]]", "1, 1, 1, 3, 7, 18, 47", 1);
  }
}
