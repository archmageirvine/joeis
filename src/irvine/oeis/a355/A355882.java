package irvine.oeis.a355;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A355882 Number of ways to 4-color a 3 X n grid ignoring the variations of two colors.
 * @author Georg Fischer
 */
public class A355882 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A355882() {
    super(1, "[[0],[-27],[18],[-1]", "3,49", 0);
  }
}
