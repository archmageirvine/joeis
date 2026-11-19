package irvine.oeis.a350;

import irvine.math.z.Z;
import irvine.oeis.a053.A053454;

/**
 * A350789 Triangle read by rows: T(n,k) is the number of unlabeled weakly connected digraphs with n arcs and k vertices, k = 1..n+1.
 * @author Gregory Morse
 */
public class A350789 extends A053454 {

  private int mN = 0;
  private int mVertices = 0;

  @Override
  public Z next() {
    if (++mVertices > mN + 1) {
      ++mN;
      mVertices = 1;
    }
    if (mN == 0) {
      return Z.ONE;
    }
    // The rows from A054733 start at one arc.
    return mN > (long) mVertices * (mVertices - 1) ? Z.ZERO : row(mVertices).coeff(mN - 1);
  }
}
