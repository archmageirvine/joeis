package irvine.oeis.a165;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A165968 Number of pairings disjoint to a given pairing, and containing a given pair not in the given pairing.
 * @author Georg Fischer
 */
public class A165968 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A165968() {
    // b(n) = 2*(n-1)*b(n-1) +2*(n-2)*b(n-2)
    super(0, "[[0],[-4, 2],[-2, 2],[-1]", "0, 1", 0);
  }
}
