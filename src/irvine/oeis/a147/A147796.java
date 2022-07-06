package irvine.oeis.a147;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A147796 Number of consistent sets of 3 irreflexive binary order relationships over n objects.
 * @author Georg Fischer
 */
public class A147796 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A147796() {
    super(3, "[[0],[0, 6, 5, 0,-1],[6, 4, 7,-6, 1]]", "6", 0);
  }
}
