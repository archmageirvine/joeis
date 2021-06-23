package irvine.oeis.a161;
// manually 2021-06-23

import irvine.oeis.HolonomicRecurrence;

/**
 * A161125 Number of descents in all involutions of {1, 2,...,n}.
 * Recurrence: a(n)/(n-1) = a(n-1)/(n-2) + (n-1)*a(n-2)/(n-3) for n&gt;=4 .
 * @author Georg Fischer
 */
public class A161125 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A161125() {
    super(0, "[[0],[-2, 5,-4, 1],[3,-4, 1],[-6, 5,-1]]", "[0, 0, 1, 4]");
  }
}
