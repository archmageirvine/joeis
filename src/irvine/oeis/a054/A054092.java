package irvine.oeis.a054;

import irvine.math.z.Z;

/**
 * A054092 T(n,n), array T as in A054090.
 * @author Georg Fischer
 */
public class A054092 extends A054090 {

  private int mN; // row index
  private int mTri; // current index of triangle element
  private int mStop; // sequenctial index of relevant triangle element

  /** Construct the sequence. */
  public A054092() {
    mN = -1;
    mTri = 0;
    mStop = 0;
  }

  @Override
  public Z next() {
    Z result = super.next();
    while (mTri < mStop) {
      ++mTri;
      result = super.next();
    }
    ++mN;
    mStop = mTri + mN + 1;
    return result;
  }
}
