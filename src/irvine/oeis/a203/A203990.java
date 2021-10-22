package irvine.oeis.a203;
// manually 2021-10-22

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;
/**
 * A203990 Symmetric matrix based on f(i,j) = (i+j)*min(i,j), by antidiagonals. 
 * @author Georg Fischer
 */
public class A203990 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A203990() {
    super(1, 1, -1);
  }

  @Override
  protected Z matrixElement(final int i, final int j) {
    return Z.valueOf((i + j) * (long) Math.min(i, j));
  }
}
