package irvine.oeis.a320;

import irvine.oeis.FiniteSequence;

/**
 * A320580 Numbers k such that for any positive integers x,y coprime to k, x^x == y (mod k) iff y^y == x (mod k).
 * @author Georg Fischer
 */
public class A320580 extends FiniteSequence {

  /** Construct the sequence. */
  public A320580() {
    super(1, FINITE, 1, 2, 4, 6, 8, 12, 16, 18, 20, 24, 32, 36, 40, 42, 48, 60, 72, 80, 84, 96, 120, 126, 144, 156, 160, 168, 180, 240, 252, 288, 312, 336, 360, 420, 468, 480, 504, 624, 672, 720, 780, 840, 936, 1008, 1092, 1248, 1260, 1440, 1560, 1680, 1872, 2016, 2184, 2340, 2520, 3120, 3276, 3360, 3744, 4368, 4680, 5040, 5460, 6240, 6552, 8736, 9360, 10080, 10920, 13104, 16380, 18720, 21840, 26208, 32760, 43680, 65520, 131040);
  }
}
