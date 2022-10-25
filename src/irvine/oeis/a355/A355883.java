package irvine.oeis.a355;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A355883 Number of ways to 5-color a 3 X n grid ignoring the variations of two colors.
 * @author Georg Fischer
 */
public class A355883 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A355883() {
    super(1, "[[0],[-116],[45],[-1]", "4,169", 0);
  }
}
