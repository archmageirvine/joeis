package irvine.oeis.a204;
// manually 2021-10-22

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A204171 Symmetric matrix based on f(i,j)=(1 if max(i,j) is odd, and 0 otherwise), by antidiagonals. 
 * @author Georg Fischer
 */
public class A204171 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A204171() {
    super(1, 1, -1);
  }

  @Override
  protected Z matrixElement(final int i, final int j) {
    return Z.valueOf((Math.max(i, j) & 1) == 1 ? 1 : 0);
  }
}
