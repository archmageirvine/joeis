package irvine.oeis.a320;

import irvine.math.z.Z;
import irvine.oeis.a000.A000005;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A320019 Coefficients of polynomials related to the number of divisors, triangle read by rows, T(n,k) for 0 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A320019 extends PartitionTransformTriangle {

  private int mN = -1;
  private int mTri = 0; // next triangular number
  private int mTrix = 0; // index of next triangular number

  /** Construct the sequence. */
  public A320019() {
    super(0, new A000005(), 0);
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

