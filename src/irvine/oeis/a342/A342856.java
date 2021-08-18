package irvine.oeis.a342;
// manually holos 2021-08-17

import irvine.oeis.HolonomicRecurrence;

/**
 * A342856 Factorial numbers n that are sqrt(n)-smooth.
 * @author Georg Fischer
 */
public class A342856 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A342856() {
    super(1, "[[0],[2, 1],[-1]]", "1, 24", 0);
  }
}
