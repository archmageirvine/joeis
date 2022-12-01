package irvine.oeis.a142;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A142995 a(0) = 0, a(1) = 1, a(n+1) = (2*n^2 + 2*n + 3)*a(n) - n^4*a(n-1), n &gt;= 1.
 * @author Georg Fischer
 */
public class A142995 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A142995() {
    super(0, "[[0],[-1, 4,-6, 4,-1],[3,-2, 2],[-1]]", "0, 1", 0);
  }
}
