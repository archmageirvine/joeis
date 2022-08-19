package irvine.oeis.a000;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A000517 Number of permutations of length n with exactly three valleys.
 * @author Georg Fischer
 */
public class A000517 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A000517() {
    super(7, "[0, 294912,-946176, 1332224,-1082624, 561728,-194304, 45360,-7056, 700,-40, 1]", "[272, 7936, 137216, 1841152]");
  }
}
