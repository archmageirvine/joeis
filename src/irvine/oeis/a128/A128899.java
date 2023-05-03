package irvine.oeis.a128;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A128899 Riordan array (1,(1-2x-sqrt(1-4x))/(2x)).
 * @author Georg Fischer
 */
public class A128899 extends PartitionTransformTriangle {

  private int mN = -1;
  private int mTri = 0; // next triangular number
  private int mTrix = 0; // index of next triangular number

  /** Construct the sequence. */
  public A128899() {
    super(0, new A000108(), 1);
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
