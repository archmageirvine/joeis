package irvine.oeis.a349;
// manually linrec/linrec2 at 2022-04-29 07:28
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A349187 Number of tilings of a 5 X n rectangle using n pentominoes of shapes X, Y, Z.
 * @author Georg Fischer
 */
public class A349187 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A349187() {
    super(0, "[[0],[-11],[-16],[-5],[0],[-2],[-33],[-38],[-7],[-8],[-20],[-14],[-10],[1],[8],[7],[13],[3],[0],[0],[0],[-1]]", "1, 0, 0, 0, 0, 6, 6, 6, 2, 10, 86, 118, 166, 152, 372, 1394, 2450, 3866, 4946, 10160, 26380, 50770", 0);
  }
}
