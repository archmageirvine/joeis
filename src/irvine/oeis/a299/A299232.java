package irvine.oeis.a299;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A299232 Ranks of {2,3}-power towers that start with 3; see Comments.
 * @author Georg Fischer
 */
public class A299232 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A299232() {
    super(0, "[[0],[1],[-2],[1]]", "[2, 5, 7, 8, 11, 12, 14]", 0);
  }
}
