package irvine.oeis.a212;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A212369 Number of Dyck n-paths all of whose ascents and descents have lengths equal to 1 (mod 10).
 * @author Georg Fischer
 */
public class A212369 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A212369() {
    super(0, "[[0],[-20, 1],[0],[0],[0],[0],[0],[0],[0],[0],[13,-2],[10,-2],[0],[0],[0],[0],[0],[0],[0],[7, 1],[-17,-2],[10, 1]]", "1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1", 0);
  }
}
