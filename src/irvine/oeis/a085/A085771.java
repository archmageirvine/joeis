package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a003.A003319;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A085771 Triangle read by rows. T(n, k) = A059438(n, k) for 1 &lt;= k &lt;= n, and T(n, 0) = n^0.
 * @author Georg Fischer
 */
public class A085771 extends PartitionTransformTriangle {

  private int mN = -1;
  private int mTri = 0; // next triangular number
  private int mTrix = 0; // index of next triangular number

  /** Construct the sequence. */
  public A085771() {
    super(0, new A003319(), 1);
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
