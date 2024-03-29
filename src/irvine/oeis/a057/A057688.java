package irvine.oeis.a057;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A057688 Trajectory of 5 under the '5x+1' map.
 * @author Georg Fischer
 */
public class A057688 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A057688() {
    super(0, "[0,-1, 0, 0, 1]", "[5, 26, 13, 66, 33, 11, 56, 28, 14, 7, 36, 18, 9, 3, 1, 6]", 0);
  }
}
