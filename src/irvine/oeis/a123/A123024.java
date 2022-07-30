package irvine.oeis.a123;
// manually dfinite/holos at 2022-07-30 11:44

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A123024 a(n) = n!*b(n) where b(n) = (b(n-2) + b(n-3))/(n*(n-1)), b(0) = b(1) = b(2) = 1.
 * Recurrence a(n) = a(n-2) + (n-2)*a(n-3).
 * @author Georg Fischer
 */
public class A123024 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A123024() {
    super(0, "[[0],[-2, 1],[1],[0],[-1]]", "1, 1, 2", 0);
  }
}
