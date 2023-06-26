package irvine.oeis.a032;

import irvine.oeis.FiniteSequence;

/**
 * A032782 Numbers k such that k(k+1)(k+2)...(k+9) / (k+(k+1)+(k+2)+...+(k+9)) is an integer.
 * @author Georg Fischer
 */
public class A032782 extends FiniteSequence {

  /** Construct the sequence. */
  public A032782() {
    super(1, FINITE, 0, 3, 6, 9, 13, 18, 20, 27, 36, 48, 63, 69, 90, 117, 118, 153, 198, 216, 279, 360, 363, 468, 603, 657, 846, 1098, 1413, 1818, 1980, 2547, 3303, 4248, 5949, 9918, 12753, 17856, 29763, 89298);
  }
}
