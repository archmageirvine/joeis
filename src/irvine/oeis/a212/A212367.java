package irvine.oeis.a212;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A212367 Number of Dyck n-paths all of whose ascents and descents have lengths equal to 1 (mod 8).
 * @author Georg Fischer
 */
public class A212367 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A212367() {
    super(0, "[[0],[-16, 1],[0],[0],[0],[0],[0],[0],[11,-2],[8,-2],[0],[0],[0],[0],[0],[5, 1],[-13,-2],[8, 1]]", "1, 1, 1, 1, 1, 1, 1, 1, 1", 0);
  }
}
