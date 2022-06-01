package irvine.oeis.a162;
// manually 2021-06-23

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A162970 Number of 2-cycles in all involutions of {1,2,...,n}.
 * Recurrence: (n-2)*a(n) = n*a(n-1) + n*(n-1)*a(n-2), a(1)=0, a(2)=1.
 * @author Georg Fischer
 */
public class A162970 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A162970() {
    super(1, "[[0],[0,-1, 1],[0, 1],[2,-1]]", "[0, 1]");
  }
}
