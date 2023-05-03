package irvine.oeis.a111;

import irvine.math.z.Z;
import irvine.oeis.a001.A001147;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A111106 Riordan array (1, x*g(x)) where g(x) is g.f. of double factorials A001147.
 * @author Georg Fischer
 */
public class A111106 extends PartitionTransformTriangle {

  private int mN = -1;
  private int mTri = 0; // next triangular number
  private int mTrix = 0; // index of next triangular number

  /** Construct the sequence. */
  public A111106() {
    super(0, new A001147(), 0);
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
