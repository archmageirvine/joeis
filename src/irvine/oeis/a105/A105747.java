package irvine.oeis.a105;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A105747 Number of ways to use the elements of {1,..,k}, 0&lt;=k&lt;=2n, once each to form a collection of n (possibly empty) lists, each of length at most 2.
 * @author Georg Fischer
 */
public class A105747 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A105747() {
    super(0, "[[0],[1],[9, 4],[-11,-4],[1]]", "1, 4, 23", 3);
  }
}
