package irvine.oeis.a111;
// manually A064437/parmof4 at 2022-12-29 14:08

import irvine.math.z.Z;
import irvine.oeis.a064.A064437;

/**
 * A111201 a(1)=1 then a(n)=a(n-1)+n if n is already in the sequence, a(n)=a(n-1)+n+1 otherwise.
 * @author Georg Fischer
 */
public class A111201 extends A064437 {

  /** Construct the sequence. */
  public A111201() {
    super(1, 1, +17, +17);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = (mN == mOffset) ? mInit : (mSet.contains(Z.valueOf(mN)) ? mPrev.add(mN) : mPrev.add(mN + 1));
    mPrev2 = mPrev;
    mPrev = result;
    mSet.add(result);
    return result;
  }
}
