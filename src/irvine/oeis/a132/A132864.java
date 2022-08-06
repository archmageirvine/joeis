package irvine.oeis.a132;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A132864 Expansion of 1/(1-4x*c(5x)), where c(x) is the g.f. of A000108.
 * Recurrence: n*a(n) + 2*(15-2*n)*a(n-1) + 160*(3-2*n)*a(n-2) = 0.
 * @author Georg Fischer
 */
public class A132864 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A132864() {
    super(0, "[[0],[480,-320],[30,-4],[0, 1]]", "1, 4", 0);
  }
}
