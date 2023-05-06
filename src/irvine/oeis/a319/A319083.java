package irvine.oeis.a319;

import irvine.math.z.Z;
import irvine.oeis.a000.A000203;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A319083 Coefficients of polynomials related to the D'Arcais polynomials and Dedekind's eta(q) function, triangle read by rows, T(n,k) for 0 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A319083 extends PartitionTransformTriangle {

  private int mN = -1;
  private int mTri = 0; // next triangular number
  private int mTrix = 0; // index of next triangular number

  /** Construct the sequence. */
  public A319083() {
    super(0, new A000203(), 0);
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == mTri) { // prefix with a column 0 = [1, 0, 0, 0 ...]
      ++mTrix;
      mTri += mTrix;
      return mN == 0 ? Z.ONE : Z.ZERO;
    }
    return super.next();
  }
}
