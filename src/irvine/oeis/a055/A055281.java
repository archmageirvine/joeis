package irvine.oeis.a055;

import irvine.oeis.HolonomicRecurrence;

/**
 * A055281 Number of rooted trees with n nodes and 6 leaves.
 * @author Georg Fischer
 */
public class A055281 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055281() {
    super(7, A055278.computeRecurrence(6), "1, 6, 30, 120, 416, 1268, 3499, 8833, 20730, 45625, 95052, 188638, 358822, 657169, 1163791, 1999495, 3343038, 5452829, 8696613, 13587910, 20834487, 31396728, 46563312, 68041054, 98068941, 139551650", 0);
  }
}

