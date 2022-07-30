package irvine.oeis.a161;
// manually dfinite/holos at 2022-07-30 09:28

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A161122 Number of cycles with entries of the same parity in all fixed-point-free involutions of {1,2,...,2n}.
 * Recurrence (-n+2)*a(n) +n*(2*n-3)*a(n-1)=0.
 * @author Georg Fischer
 */
public class A161122 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A161122() {
    super(0, "[[0],[0,-3, 2],[2,-1]]", "0, 0, 2", 0);
  }
}
