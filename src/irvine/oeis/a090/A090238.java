package irvine.oeis.a090;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A090238 Triangle T(n, k) read by rows. T(n, k) is the number of lists of k unlabeled permutations whose total length is n.
 * @author Georg Fischer
 */
public class A090238 extends PartitionTransformTriangle {

  private int mN = -1;
  private int mTri = 0; // next triangular number
  private int mTrix = 0; // index of next triangular number

  /** Construct the sequence. */
  public A090238() {
    super(0, new A000142(), 1);
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
