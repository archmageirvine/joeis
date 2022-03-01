package irvine.oeis.a055;

import irvine.oeis.HolonomicRecurrence;

/**
 * A055278 Number of rooted trees with n nodes and 3 leaves.
 * @author Georg Fischer
 */
public class A055278 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055278() {
    super(3, "[[0],[1],[-3],[2],[1],[0],[-1],[-2],[3],[-1]", "1, 3, 8, 18", 0);
  }
}
