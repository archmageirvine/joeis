package irvine.oeis.a137;
// manually holom/holos at 2023-07-20 14:24

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A137638 Antidiagonal sums of square array A137634.
 * @author Georg Fischer
 */
public class A137638 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A137638() {
    super(0, "[[0],[20,-8],[74,-36],[80,-56],[20,-34],[-7,-3],[2, 2]]", "[1, 3, 15, 72, 361]", 0);
  }
}
