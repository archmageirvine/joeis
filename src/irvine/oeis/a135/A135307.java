package irvine.oeis.a135;
// Generated by gen_seq4.pl holos at 2021-06-13 21:50
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A135307 Number of Dyck paths of semilength n that do not contain the string UDDU.
 * Recurrence: -a(n)*(n*(n+1)*(28*n^2-70*n+39))+(2*n*(n-1)*(28*n^2-56*n-3)*a(n-1)+(140*n^4-630*n^3+1063*n^2-699*n+144)*a(n-2)-12*(n-3)*(14*n^3-42*n^2+16*n+21)*a(n-3)+23*(n-3)*(n-4)*(28*n^2-14*n-3)*a(n-4))
 * @author Georg Fischer
 */
public class A135307 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A135307() {
    super(0, "[[0],[-828,-3381, 9913,-4830, 644],[756, 324,-1704, 1008,-168],[144,-699, 1063,-630, 140],[0, 6, 106,-168, 56],[0,-39, 31, 42,-28]]", "[1, 1, 2, 4]", 0);
  }
}
