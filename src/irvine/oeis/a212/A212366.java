package irvine.oeis.a212;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A212366 Number of Dyck n-paths all of whose ascents and descents have lengths equal to 1 (mod 7).
 * @author Georg Fischer
 */
public class A212366 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A212366() {
    super(0, "[[0],[-14, 1],[0],[0],[0],[0],[0],    [10,-2],[7,-2],[0],[0],[0],[0],    [4, 1],[-11,-2],[7, 1]]", "1, 1, 1, 1, 1, 1, 1, 1", 0);
  }
}
