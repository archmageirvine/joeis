package irvine.oeis.a229;

import irvine.oeis.HolonomicRecurrence;

/**
 * A229464 Binomial transform of (2*n + 1)!.
 * a(n) = 1 + 2*n*(2*n + 1)*a(n-1) - 2*n*(2*n - 2)*a(n-2) with a(0) = 1 and a(1) = 7
 * @author Georg Fischer
 */
public class A229464 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A229464() {
    super(0, "[[1],[0, 4,-4],[0, 2, 4],[-1]", "1, 7", 0);
  }
}
