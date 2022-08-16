package irvine.oeis.a055;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A055328 Number of rooted identity trees with n nodes and 3 leaves.
 * @author Georg Fischer
 */
public class A055328 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055328() {
    super(6, A055278.computeRecurrence(3), "1, 5, 13, 28", 0);
  }
}
