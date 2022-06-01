package irvine.oeis.a064;
// manually

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A064570 Binomial transform of (2n)!.
 * a(n) = 1 + 2*n*(2*n - 1)*a(n-1) - 2*n*(2*n - 2)*a(n-2) with a(0) = 1 and a(1) = 3.
 * @author Georg Fischer
 */
public class A064570 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A064570() {
    super(0, "[[1],[0, 4,-4],[0,-2, 4],[-1]]", "[1, 3]", 0);
  }
}
