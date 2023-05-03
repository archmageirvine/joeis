package irvine.oeis.a319;

import irvine.math.z.Z;
import irvine.oeis.a000.A000122;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A319574 A(n, k) = [x^k] JacobiTheta3(x)^n, square array read by descending antidiagonals, A(n, k) for n &gt;= 0 and k &gt;= 0.
 * @author Georg Fischer
 */
public class A319574 extends PartitionTransformTriangle {

  private int mN = -1;
  private int mTri = 0; // next triangular number
  private int mTrix = 0; // index of next triangular number

  /** Construct the sequence. */
  public A319574() {
    super(0, new A000122(), 0);
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
