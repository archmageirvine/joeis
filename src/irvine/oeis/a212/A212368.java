package irvine.oeis.a212;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A212368 Number of Dyck n-paths all of whose ascents and descents have lengths equal to 1 (mod 9).
 * @author Georg Fischer
 */
public class A212368 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A212368() {
    super(0, "[[0],[-18, 1],[0],[0],[0],[0],[0],[0],[0],[12,-2],[9,-2],[0],[0],[0],[0],[0],[0],[6, 1],[-15,-2],[9, 1]]", "1, 1, 1, 1, 1, 1, 1, 1, 1, 1", 0);
  }
}
