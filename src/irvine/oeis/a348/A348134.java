package irvine.oeis.a348;
// manually linrec/linrec2 at 2022-04-29 07:28

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A348134 Number of ways two L-tiles (with rotation) can be placed on an n X n square.
 * @author Georg Fischer
 */
public class A348134 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A348134() {
    super(1, "[[0],[1],[-5],[10],[-10],[5],[-1]]", "0, 0, 22, 336, 1422, 3952", 0);
  }
}
