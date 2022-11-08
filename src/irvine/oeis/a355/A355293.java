package irvine.oeis.a355;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A355293 Expansion of e.g.f. 1 / (1 - x - x^2/2 - x^3/3).
 * @author Georg Fischer
 */
public class A355293 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A355293() {
    super(0, "[[0],[0,4,-6,2],[0,-3,3],[0,6],[-6]]", "1", 0);
  }
}
