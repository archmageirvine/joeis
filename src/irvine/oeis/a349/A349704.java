package irvine.oeis.a349;
// manually linrec/linrec2 at 2022-04-29 07:28

import irvine.oeis.HolonomicRecurrence;

/**
 * A349704 Maximum terminal Wiener index for a tree of n vertices.
 * @author Georg Fischer
 */
public class A349704 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A349704() {
    super(0, "[[0],[-1],[2],[-1],[2],[-4],[2],[-1],[2],[-1]]", "0, 0, 1, 2, 6, 12, 20, 30, 42, 56, 72, 92, 115, 140, 170", 0);
  }
}
