package irvine.oeis.a189;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A189791 Number of ways to place n nonattacking bishops on an 2n x 2n toroidal board.
 * Recurrence: a(n) = ((14*n^2-14*n+4)*a(n-1) + 32*(n-1)^3*a(n-2))/n.
 * @author Georg Fischer
 */
public class A189791 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A189791() {
    super(1, "[[0],[-32, 96,-96, 32],[4,-14, 14],[0,-1]", "4, 80", 0);
  }
}
