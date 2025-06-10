package irvine.oeis.a086;
// manually 2025-06-09/holos at 2025-06-10 07:05

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A086677 Number of Steiner topologies on n points.
 * Offset 2; recurrence: <code>(n+3)*(5*n+9)*a(n) +(n+3)*(n+2)*a(n-1)+(n+1)*(3*n+1)*a(n+1)-(n+1)*(n+2)*a(n+2) = 0</code>.
 * @author Georg Fischer
 */
public class A086677 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A086677() {
    super(0, "[[0],[0,1,1],[-1,4,5],[5,-8,3],[0,1,-1]]", "1,4,31,360", 0, 1);
    setOffset(2);
  }
}
