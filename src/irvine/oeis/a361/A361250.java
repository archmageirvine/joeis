package irvine.oeis.a361;
// manually holsig2/holos at 2023-08-08 18:53

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A361250 Number of tilings of a 5 X n rectangle using n pentominoes of shapes T, N, X.
 * @author Georg Fischer
 */
public class A361250 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A361250() {
    super(0, "[0,-1,-6, 0,-2, 6,-1, 3, 0, 1, 0, 1, 1, 0, 0,-1]", "1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 2", 0);
  }
}
