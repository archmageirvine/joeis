package irvine.oeis.a344;
// manually holos at 2021-08-18

import irvine.oeis.recur.HolonomicRecurrence;
/**
 * A344747 a(n) = (1/6)*(3^n + (-2)^n - 1).
 * @author Georg Fischer
 */
public class A344747 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A344747() {
    super(1, "[[0],[-6],[5],[2],[-1]", "[0, 2, 3]", 0);
  }
}
