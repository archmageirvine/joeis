package irvine.oeis.a348;
// manually linrec/linrec2 at 2022-04-29 10:02

import irvine.oeis.HolonomicRecurrence;

/**
 * A348237 Coordination sequence for the cpq net with respect to a node where a hexagon and two octagons meet.
 * @author Georg Fischer
 */
public class A348237 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A348237() {
    super(0, "[[0],[-1],[1],[-1],[1],[0],[1],[-1],[1],[-1]]", "1, 3, 6, 9, 10, 13, 18, 21, 22, 23", 0);
  }
}
