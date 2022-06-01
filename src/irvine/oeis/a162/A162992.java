package irvine.oeis.a162;
// manually 2021-06-23

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A162992 The second right hand column of triangle A162990.
 * Recurrence: a(n) = ((n+1)!/(n-1))^2 for n&gt;=2
 * @author Georg Fischer
 */
public class A162992 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A162992() {
    super(2, "[[0],[-4,-4, 3, 2,-1],[1,-2, 1]]", "[36]");
  }
}
