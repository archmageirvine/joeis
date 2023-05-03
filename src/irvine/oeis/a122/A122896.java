package irvine.oeis.a122;

import irvine.math.z.Z;
import irvine.oeis.a001.A001006;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A122896 Riordan array (1, (1 - x - sqrt(1 - 2*x - 3*x^2)) / (2*x)), a Riordan array for directed animals. Triangle read by rows.
 * @author Georg Fischer
 */
public class A122896 extends PartitionTransformTriangle {

  private int mN = -1;
  private int mTri = 0; // next triangular number
  private int mTrix = 0; // index of next triangular number

  /** Construct the sequence. */
  public A122896() {
    super(0, new A001006(), 0);
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
