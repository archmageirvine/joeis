package irvine.oeis.a055;

import irvine.oeis.HolonomicRecurrence;
/**
 * A055279 Number of rooted trees with n nodes and 4 leaves.
 * @author Georg Fischer
 */
public class A055279 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055279() {
    super(4, "[[0],[1],[-3],[1],[4],[-3],[1],[-3],[0],[3],[-1],[3],[-4],[-1],[3],[-1]", "1, 4, 14, 39, 97, 212, 429, 804, 1427", 0);
  }
}
