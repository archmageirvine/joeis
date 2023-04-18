package irvine.oeis.a063;
// manually A204459/arronk

import irvine.math.z.Z;
import irvine.oeis.a204.A204459;

/**
 * A063074 Number of partitions of 2n^2 whose Ferrers-plot fits within a 2n X 2n box; number of ways to cut a 2n X 2n chessboard into two equal-area pieces along a non-descending line from lower left to upper right.
 * @author Georg Fischer
 */
public class A063074 extends A204459 {

  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return matrixElement(2, mN);
  }
}

