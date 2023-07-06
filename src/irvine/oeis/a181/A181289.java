package irvine.oeis.a181;

import irvine.math.z.Z;
import irvine.oeis.a000.A000027;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A181289 Triangle read by rows: T(n,k) is the number of 2-compositions of n having length k (0 &lt;= k &lt;= n).
 * @author Georg Fischer
 */
public class A181289 extends PartitionTransformTriangle {

  private int mN = -1;
  private int mTri = 0; // next triangular number
  private int mTrix = 0; // index of next triangular number

  /** Construct the sequence. */
  public A181289() {
    super(0, new A000027().skip(1), 0);
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
