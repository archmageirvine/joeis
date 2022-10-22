package irvine.oeis.a357;
// manually partrapl/partran at 2022-10-20 14:23

import irvine.math.z.Z;
import irvine.oeis.a089.A089026;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A357368 allocated for Peter Luschny.
 * @author Georg Fischer
 */
public class A357368 extends PartitionTransformTriangle {

  private int mN = -1;
  private int mTri = 0; // next triangular number
  private int mTrix = 0; // index of next triangular number

  /** Construct the sequence. */
  public A357368() {
    super(0, new A089026());
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
