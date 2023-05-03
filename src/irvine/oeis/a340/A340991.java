package irvine.oeis.a340;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.oeis.triangle.PartitionTransformTriangle;

/**
 * A340991 Triangle T(n,k) whose k-th column is the k-fold self-convolution of the primes; triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows.
 * @author Georg Fischer
 */
public class A340991 extends PartitionTransformTriangle {

  private int mN = -1;
  private int mTri = 0; // next triangular number
  private int mTrix = 0; // index of next triangular number

  /** Construct the sequence. */
  public A340991() {
    super(0, new A000040(), 0);
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
