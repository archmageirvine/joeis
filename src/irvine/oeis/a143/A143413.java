package irvine.oeis.a143;
// manually 2023-01-19

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A143413 Ap√©ry-like numbers for the constant e: a(n) = 1/(n-1)!*Sum_{k = 0..n+1} (-1)^k*C(n+1,k)*(2*n-k)! for n &gt;= 1.
 * @author Georg Fischer
 */
public class A143413 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A143413() {
    super(0, "[[0],[0, 0,-1],[1,-4, 6,-4],[1,-2, 1]]", "-1, 1", 0);
  }
}
