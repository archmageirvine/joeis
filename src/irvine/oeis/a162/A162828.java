package irvine.oeis.a162;

import irvine.oeis.FiniteSequence;

/**
 * A162828 Positive numbers n such that 2*90*n/(90+n) are integers.
 * @author Georg Fischer
 */
public class A162828 extends FiniteSequence {

  /** Construct the sequence. */
  public A162828() {
    super(1, FINITE, 10, 18, 30, 45, 60, 72, 90, 110, 126, 135, 180, 210, 234, 270, 315, 360, 450, 510, 558, 585, 720, 810, 990, 1260, 1530, 1710, 1935, 2610, 3150, 3960, 5310, 8010, 16110);
  }
}
