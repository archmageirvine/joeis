package irvine.oeis.a055;

import irvine.math.polynomial.Polynomial;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A055913 Column 7 of triangle A055907.
 * @author Sean A. Irvine
 */
public class A055913 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A055913() {
    super(7, Polynomial.create(A055916.TERMS).shift(7),
      Polynomial.create(1, -8, 31, -80, 156, -240, 288, -240, 40, 336, -852, 1392, -1766, 1760, -1210, 80, 1486, -3168, 4526, -5104, 4560, -2800, 60, 3120, -6011, 7880, -8189, 6752, -3812, 0, 3812, -6752, 8189, -7880, 6011, -3120, -60, 2800, -4560, 5104, -4526, 3168, -1486, -80, 1210, -1760, 1766, -1392, 852, -336, -40, 240, -288, 240, -156, 80, -31, 8, -1));
  }
}
