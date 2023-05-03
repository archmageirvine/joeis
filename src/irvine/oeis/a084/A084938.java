package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A084938 Triangle read by rows: T(n,k) = Sum_{j&gt;=0} j!*T(n-j-1, k-1) for n &gt;= 0, k &gt;= 0.
 * @author Georg Fischer
 */
public class A084938 extends PartitionTransformTriangle {

  private int mN = -1;
  private int mTri = 0; // next triangular number
  private int mTrix = 0; // index of next triangular number

  /** Construct the sequence. */
  public A084938() {
    super(0, new A000142());
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
