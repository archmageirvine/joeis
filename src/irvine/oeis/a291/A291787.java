package irvine.oeis.a291;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A291787 Trajectory of 45 under repeated application of the map k -&gt; A291784(k).
 * @author Georg Fischer
 */
public class A291787 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A291787() {
    super(0, "[[0],[2],[0],[0],[0],[0],[0],[0],[-1]", "45, 48, 56, 60, 80, 88, 92, 94, 95, 96, 112, 120, 160, 176, 184, 188, 190, 216, 252, 324, 378, 486, 567, 594, 738, 876, 1032, 1224, 1488, 1776, 2112, 2624, 2656, 2672, 2680, 2976, 3552, 4224, 5248, 5312, 5344, 5360, 5952, 7104, 8448, 10496, 10624", 0);
  }
}
